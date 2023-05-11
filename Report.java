abstract class Report{
    void runReport(){
        //set up Report
    }
    void printReport(){
        //generic printing
    }
}

class BuzzwordsReport extends Report{
    @Override
    void runReport(){
        super.runReport();
        buzzwordCompliance();
        printReport();
    }
    void buzzwordCompliance(){...}
}