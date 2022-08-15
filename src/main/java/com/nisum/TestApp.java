package com.nisum;


import org.apache.log4j.*;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

public class TestApp {
    private static Logger log = Logger.getLogger(TestApp.class);
    public static void main(String[] args) {


        log.debug("HELLO ONE");
        log.info("HELLO TWO");
        log.warn("HELLO THREE");
        log.error("HELLO XYZ");
        log.fatal("HELLO MNO");
    }
}

