<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Setting Cookie</title>
    <style>
        .info-box {
            margin: 20px;
            padding: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .success {
            color: green;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div class="info-box">
        <%
            // Get parameters from request
            String name = request.getParameter("cookieName");
            String domain = request.getParameter("domain");
            String maxAge = request.getParameter("maxAge");

            if (name != null && domain != null && maxAge != null) {
                try {
                    int maxAgeInt = Integer.parseInt(maxAge);
                    long currentTimeSeconds = System.currentTimeMillis() / 1000;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String timestamp = sdf.format(new Date());

                    // Get or initialize cookie list in session
                    @SuppressWarnings("unchecked")
                    List<Map<String, String>> cookieList = (List<Map<String, String>>) session.getAttribute("cookieList");
                    if (cookieList == null) {
                        cookieList = new ArrayList<>();
                    }

                    // Create cookie entry for session tracking
                    Map<String, String> cookieEntry = new HashMap<>();
                    cookieEntry.put("name", name);
                    cookieEntry.put("domain", domain);
                    cookieEntry.put("maxAge", maxAge);
                    cookieEntry.put("setTime", String.valueOf(currentTimeSeconds));

                    // Create actual HTTP cookie
                    Cookie cookie = new Cookie(name, "value");
                    cookie.setMaxAge(maxAgeInt);

                    // Only set domain if valid (avoid issues with localhost)
                    if (!"localhost".equalsIgnoreCase(domain)) {
                        cookie.setDomain(domain);
                    }

                    response.addCookie(cookie);

                    // Add to session list
                    cookieList.add(cookieEntry);
                    session.setAttribute("cookieList", cookieList);
        %>
                    <h3 class="success">Cookie Set Successfully</h3>
                    <p><strong>Cookie Name:</strong> <%= name %></p>
                    <p><strong>Domain:</strong> <%= domain %></p>
                    <p><strong>Max Age:</strong> <%= maxAge %> seconds</p>
                    <p><strong>Set Time:</strong> <%= timestamp %></p>
        <%
                } catch (Exception e) {
        %>
                    <h3 class="error">Error: Invalid input</h3>
                    <p><%= e.getMessage() %></p>
        <%
                }
            } else {
        %>
                <h3 class="error">Missing Parameters</h3>
                <p>Please ensure all fields are filled out correctly.</p>
        <%
            }
        %>
        <p><a href="index.jsp">Return to Cookie List</
