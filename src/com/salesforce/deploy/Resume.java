package com.salesforce.deploy;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Resume implements FileWriteable{ 
    public void run() throws IOException { 
        FileWriter fstream = new FileWriter("logs\\Resume.xsl");
        BufferedWriter out = new BufferedWriter(fstream);
        out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
        out.newLine();
        out.write("<!-- Edited by XMLSpy� -->");
        out.newLine();
        out.write("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">");
        out.newLine();
        out.write("  <xsl:template match=\"/\">");
        out.newLine();
        out.write("    <html>");
        out.newLine();
        out.write("      <head>");
        out.newLine();
        out.write("        <title>Resume</title>");
        out.newLine();
        out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Tabs.css\"");
        out.newLine();
        out.write("             title=\"Style\"/>");
        out.newLine();
        out.write("      </head>");
        out.newLine();
        out.write("      <body>");
        out.newLine();
        out.write("        <div id=\"menu\">");
        out.newLine();
        out.write("          <ul>");
        out.newLine();
        out.write("            <li>");
        out.newLine();
        out.write("              <a href=\"resume.xml\" title=\"Resume\" class=\"active\">Resume</a>");
        out.newLine();
        out.write("            </li>");
        out.newLine();
        out.write("            <li>");
        out.newLine();
        out.write("              <a href=\"unitTest.xml\" title=\"Unit Test\">Unit Test</a>");
        out.newLine();
        out.write("            </li>");
        out.newLine();
        out.write("            <li>");
        out.newLine();
        out.write("              <a href=\"codeCoverage.xml\" title=\"Code Coverage\">Code Coverage</a>");
        out.newLine();
        out.write("            </li>");
        out.newLine();
        out.write("          </ul>");
        out.newLine();
        out.write("        </div>");
        out.newLine();
        out.write("        <div id=\"main\">");
        out.newLine();
        out.write("          <br/>");
        out.newLine();
        out.write("          <h2>Totals</h2>");
        out.newLine();
        out.write("          <table width=\"100%\">");
        out.newLine();
        out.write("            <tr bgcolor=\"#FFCC66\">");
        out.newLine();
        out.write("              <th>Totals</th>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Total of lines of code");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td  bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/TotalCode/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Total of lines of code Coverage");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td  bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/TotalCodeCoverage/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr  bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Total of lines of code not coverage");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/TotalExceptionCode/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Percent Code Coverage");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/AvgCodeCoverage/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr  bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Failed Unit Test");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/Failure/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("            <tr  bgcolor=\"#99CCFF\">");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                Success Unit Test");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("              <td>");
        out.newLine();
        out.write("                <xsl:value-of select=\"results/total/Success/item\" />");
        out.newLine();
        out.write("              </td>");
        out.newLine();
        out.write("            </tr>");
        out.newLine();
        out.write("          </table>");
        out.newLine();
        out.write("        </div>");
        out.newLine();
        out.write("      </body>");
        out.newLine();
        out.write("    </html>");
        out.newLine();
        out.write("  </xsl:template>");
        out.newLine();
        out.write("</xsl:stylesheet>");
        out.newLine();
        out.close();
    }
}
