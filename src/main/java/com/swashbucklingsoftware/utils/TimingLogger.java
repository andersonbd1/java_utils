package com.swashbucklingsoftware.utils;

public class TimingLogger {

    /*
     * @SuppressWarnings("unchecked")
    protected static ThreadLocal timingStats = new ThreadLocal() {
    	protected synchronized Object initialValue() {
    		TimingStats ts = new TimingStats();
    		ts.log("TimingStats()");
            return ts;
        }
    };
    */

    protected static TimingStats ts = new TimingStats();

    public static void log(String message) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.log(message);
        }
    }

    public static void log(String message, boolean suppressOutput) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.log(null, message, suppressOutput);
        }
    }

    public static void log(String name, String message, boolean suppressOutput) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.log(name, message, suppressOutput);
        }
    }

    public static void start(String name) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.start(name);
        }
    }

    public static void stop(String name) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.stop(name);
        }
    }

    public static void turnOn() {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.turnOn();
        }
    }

    public static void turnOff() {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.turnOff();
        }
    }

    public static void add(String name, long l) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.add(name, l);
        }
    }

    public static void reset(long counts) {
        // TimingStats.LOG.debug("", new Exception());
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.reset(counts);
        }
    }

    public static void reset() {
        // TimingStats.LOG.debug("", new Exception());
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.reset();
        }
    }

    public static void reset(boolean includeDefault) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.reset(includeDefault);
        }
    }

    public static void reset(String name) {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.reset(name);
        }
    }

    public static void outputMemory() {
        if (TimingStats.LOG.isDebugEnabled()) {
            // TimingStats ts = (TimingStats)timingStats.get();
            ts.outputMemory();
        }
    }

}
