package com.genfinfder.demo.initialization;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class FileLoader {
    static String getPathToTargetFile(String[] args) throws FileNotFoundException {
        if (args.length >= 1) {
            return args[0];
        }
        throw new FileNotFoundException("DNA file location in not specified at args[0]");
    }

    private FileLoader() {
    }
}


