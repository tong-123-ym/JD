package com.newer.Servlet;

import com.google.gson.Gson;
import com.newer.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/rooms")
public class RoomsServlet extends HttpServlet {
private RoomService roomService=new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        String type = req.getParameter("type");
        System.out.println(type);
        if (type == null) {
            List<String> list = roomService.findType();
            Gson gson = new Gson();
            PrintWriter pw = resp.getWriter();
            //将集合转换成json数组
            pw.print(gson.toJson(list));
            pw.close();
        }else if(type.equals("id")){
            String roomtype = req.getParameter("roomtype");
            System.out.println(roomtype);
            List<String> list = roomService.findrid(roomtype);
            Gson gson = new Gson();
            PrintWriter pw = resp.getWriter();
            //将集合转换成json数组
            pw.print(gson.toJson(list));
            pw.close();
        }

    }

}
