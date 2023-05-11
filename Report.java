abstract class Report{
    void runReport(){
       System.out.println("Setting up the report...");
    }
    void printReport(){
        System.out.println("Printing the report...");
    }
}

class BuzzwordsReport extends Report{
    @Override
    void runReport(){
        super.runReport(); //invoking the runReport() method of the superclass (Report)
        buzzwordCompliance(); //specific operation defined in the BuzzwordsReport class
        printReport(); //invoking the printReport() method of the superclass (Report)
    }
    void buzzwordCompliance(){
        System.out.println("Complying to the buzzwords");
    }
}

public class Main{
    public static void main(String[] args){
        BuzzwordsReport buzzwordsReport = new BuzzwordsReport();
        buzzwordsReport.runReport();
    }
}

//you can invoke the superclass method('runReport()') and combine its
//functionality with the specific operations ('buzzwordCompliance()')defined
//in the subclass ('BuzzwordsReport').