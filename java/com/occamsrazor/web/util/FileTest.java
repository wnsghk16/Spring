package com.occamsrazor.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class FileTest {
	/*
	public final static String FILE_PATH = "C:\\Users\\bit22\\spring-workspace\\occamsrazor\\src\\main\\resources\\static\\member\\";
	public static void main(String[] args) {
		try {
			File file = new File(FILE_PATH+"list.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> list = new ArrayList<>();
			while(true) {
				switch(JOptionPane.showInputDialog("0.종료 1.쓰기 2.읽기")){
				case "0": return;
				case "1": 
					String message = JOptionPane.showInputDialog("메시지 입력");
					writer.write(message);
					writer.newLine();
					writer.flush(); //카톡에서 엔터는 줄바꿈이고 보내기버튼 누르면 메세지 전송하듯 보내기버튼같은거
					break;
				case "2": 
					while((message = reader.readLine()) != null) {
						list.add(message+"/");
					}
					JOptionPane.showMessageDialog(null, list);
					reader.close(); //다 읽었으면 닫아주기
					break;
				}
			}
			
		}catch(Exception e){
		}
	}*/
}
