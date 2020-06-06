package sda.wzorce.openclosed.excercise;

public class PlainReportPrinter implements ContentPrinter{

    @Override
    public void printContent(Report report) {
        System.out.println(report.getContent());
    }
}
