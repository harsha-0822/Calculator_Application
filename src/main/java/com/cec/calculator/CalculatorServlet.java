package com.cec.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = res.getWriter();

        String func = req.getParameter("func");

        try {
            // ✅ For scientific functions
            if (func != null) {
                double value = Double.parseDouble(req.getParameter("value"));
                double result = 0;

                switch (func) {
                    case "sqrt": result = Math.sqrt(value); break;
                    case "square": result = Math.pow(value, 2); break;
                    case "inverse": result = 1 / value; break;
                    case "sin": result = Math.sin(Math.toRadians(value)); break;
                    case "cos": result = Math.cos(Math.toRadians(value)); break;
                    case "tan": result = Math.tan(Math.toRadians(value)); break;
                    case "log": result = Math.log10(value); break;
                    case "ln": result = Math.log(value); break;
                    case "power": result = Math.pow(value, 2); break;
                    default: out.print("⚠️ Invalid function!"); return;
                }
                out.print("✅ Result: " + result);
                return;
            }

            // ✅ Normal arithmetic operations
            double num1 = Double.parseDouble(req.getParameter("num1"));
            double num2 = Double.parseDouble(req.getParameter("num2"));
            String op = req.getParameter("operator").trim();

            double result = 0;
            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 == 0) { out.print("❌ Cannot divide by zero!"); return; }
                    result = num1 / num2; break;
                default: out.print("⚠️ Invalid operator!"); return;
            }

            out.print("✅ Result: " + result);

        } catch (NumberFormatException e) {
            out.print("⚠️ Please enter valid numbers!");
        } catch (Exception e) {
            out.print("⚠️ Error: " + e.getMessage());
        }
    }
}
