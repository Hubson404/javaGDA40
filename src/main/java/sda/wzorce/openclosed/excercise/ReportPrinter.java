package sda.wzorce.openclosed.excercise;

public class ReportPrinter {

    private ContentPrinter contentPrinter;

/*    public ReportPrinter() {

    }*/

    public ReportPrinter(ContentPrinter contentPrinter) {
        this.contentPrinter = contentPrinter;
    }

    public void printReport(Report report) {
        upPrinter(report);
        contentPrinter.printContent(report);
        downPrinter(report);
    }

    private void upPrinter(Report report) {
        System.out.println(report.getDate());
        System.out.println(report.getTitle());
    }

    private void downPrinter(Report report) {
        System.out.println(report.getAuthor());
    }

    void setContentPrinter(ContentPrinter contentPrinter) {
        this.contentPrinter = contentPrinter;
    }

}
