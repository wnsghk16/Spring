package com.occamsrazor.web.grade;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	int count;
	public GradeServiceImpl() {
		grades = new Grade[5];
		count =0;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = new Grade();
		count++;
	}
	@Override
	public Grade[] list() {
		return grades;
	}
	@Override
	public Grade detail(String userid) {
		Grade result = null;
		for(int i=0; i<count; i++) {
			if(userid.equals(grades[i].getUserid())) {
				result = new Grade();
				result = grades[i];
				break;
			}
		}
		return result;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public int total(Grade grade) {
		return Integer.parseInt(grade.getKorean()+grade.getMath()+grade.getEnglish()+grade.getJava());
	}
	@Override
	public int avg(Grade grade) {
		return total(grade)/3;
	}
	@Override
	public String record(Grade grade) {
		String result = "";
		int avg = avg(grade)/10;
		
		switch(avg) {
			case 9 : 
				result = "A";
				break;
			case 8 : 
				result = "B";
				break;
			case 7 : 
				result = "C";
				break;
			case 6 : 
				result = "D";
				break;
			case 5 : 
				result = "E";
				break;
			default : 
				result = "F";
				break;			
		}
		return result;	
	}
	@Override
	public void update(Grade grade) {
		for(int i=0; i<count; i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				grades[i].setKorean(grade.getKorean());
				grades[i].setMath(grade.getMath());
				grades[i].setEnglish(grade.getEnglish());
				grades[i].setJava(grade.getJava());
				break;
			}
		}
	}
	@Override
	public void delete(Grade grade) {
		for(int i=0; i<count; i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				grades[i] = grades[count-1];
				grades[count-1] = null;
				count--;
			}
		}
	}

}
