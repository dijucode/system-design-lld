package designloggingsystem;

public class Main {

    public static void main(String[] args) {


        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));


        logObject.log(LogProcessor.ERROR, " Exception happens");
        logObject.log(LogProcessor.DEBUG, " Debugging the code");
        logObject.log(LogProcessor.INFO, " This is an information");


    }


}
