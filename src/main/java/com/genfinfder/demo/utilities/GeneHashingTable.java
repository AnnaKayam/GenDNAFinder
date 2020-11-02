//package com.genfinfder.demo.model;
//
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class GeneHashingTable {
////    private static Map<String, String> hashMap = new HashMap<>();
//    private static final Map<String, String> encodingMap = Stream.of(new String[][] {
//        { "A", "A" }, { "C", "C" }, { "G", "G" }, { "T", "T" },
//
//        { "AA", "AA" }, { "CC", "CC" }, { "GG", "GG" }, { "TT", "TT" },
//        { "AC", "AC" }, { "CA", "CA" }, { "AG", "AG" }, { "GA", "GA" },
//        { "AT", "AT" }, { "TA", "TA" }, { "CT", "CT" }, { "TC", "TC" },
//        { "CG", "CG" }, { "GC", "GC" }, { "GT", "GT" }, { "TG", "TG" },
//
//        { "AAA", "B" }, { "AAC", "D" },{ "AAG", "E" },{ "AAT", "F" },
//        { "CCC", "H" },{ "CCA", "I" },{ "CCG", "J" },{ "CCT", "K" },
//        { "GGG", "L" }, { "GGA", "M" },{ "GGC", "N" },{ "GGT", "O" },
//        { "TTT", "P" },{ "TTA", "Q" },{ "TTC", "R" },{ "TTG", "S" },
//        { "ACA", "U" },{ "ACC", "V" },{ "ACG", "W" },{ "ACT", "X" },
//        { "CAA", "Y" },{ "CAC", "Z" },{ "CAG", "a" },{ "CAT", "b" },
//        { "AGA", "c" },{ "AGC", "d" },{ "AGG", "e" },{ "AGT", "f" },
//        { "GAA", "g" },{ "GAC", "h" },{ "GAG", "i" },{ "GAT", "j" },
//        { "ATA", "k" }, { "ATC", "l" },{ "ATG", "m" },{ "ATT", "n" },
//        { "TAA", "o" },{ "TAC", "p" },{ "TAG", "q" },{ "TAT", "r" },
//        { "CTA", "s" }, { "CTC", "t" },{ "CTG", "u" },{ "CTT", "v" },
//        { "TCA", "w" },{ "TCC", "x" },{ "TCG", "y" },{ "TCT", "z" },
//        { "CGA", "0" }, { "CGC", "1" },{ "CGG", "2" },{ "CGT", "3" },
//        { "GCA", "4" },{ "GCC", "5" },{ "GCG", "6" },{ "GCT", "7" },
//        { "GTA", "8" },{ "GTC", "9" },{ "GTG", "H" },{ "GTT", "#" },
//        { "TGA", "[" },{ "TGC", "]" },{ "TGG", "(" },{ "TGT", ")" }
//    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
//
//    public static String getEncoding(String str) {
//        return encodingMap.get(str);
//    }
//
//}
