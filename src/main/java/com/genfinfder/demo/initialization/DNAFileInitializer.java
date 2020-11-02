package com.genfinfder.demo.initialization;

import com.genfinfder.demo.service.DNAFileParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@Component
public class DNAFileInitializer {
    private static final Logger log = LoggerFactory.getLogger(DNAFileInitializer.class);

    @Autowired
    private ApplicationArguments args;

    @Autowired
    private final DNAFileParser fileParser;

    private Scanner scan;

    public DNAFileInitializer(DNAFileParser parser) {
        this.fileParser = parser;
    }

    @PostConstruct
    public void initialize() {
        try (FileReader in = new FileReader(FileLoader.getPathToTargetFile(args.getSourceArgs()))) {
            this.scan = new Scanner(in);
            this.fileParser.processDNAFile(scan);
        } catch (FileNotFoundException e) {
            log.error("No file found...");
            e.printStackTrace();
        } catch (IOException e) {
            log.error("IO exception while reading DNA file...");
            e.printStackTrace();
        } finally {
            if (scan != null)
                scan.close();
        }
    }
}
