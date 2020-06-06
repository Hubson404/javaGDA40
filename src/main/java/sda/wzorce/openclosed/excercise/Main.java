package sda.wzorce.openclosed.excercise;

import java.util.Date;

public class Main {



    public static void main(String[] args) {
        Report report = new Report("Maniek", "Raportcik", new Date(), "Tresc raportu");
        JsonReportPrinter jsonContentPrinter = new JsonReportPrinter();
        ReportPrinter jsonReportPrinter = new ReportPrinter(new JsonReportPrinter());
        ReportPrinter xmlReportPrinter = new ReportPrinter(new XmlReportPrinter());
        ReportPrinter plainReportPrinter = new ReportPrinter(new PlainReportPrinter());

//        reportPrinter.printReport(report, Format.PLAIN);
//        reportPrinter.printReport(report, Format.XML);
//        reportPrinter.printReport(report, Format.JSON);
//        reportPrinter.printReport(report, Format.JSON);
    }
}
