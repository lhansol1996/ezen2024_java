package ezen2024_java;

import java.util.Arrays;

public class Student {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

 
    
    @Override
	public String toString() {
		return "Student [학생이름=" + name + ", koreanScore=" + koreanScore + ", englishScore=" + englishScore
				+ ", mathScore=" + mathScore + "]";
	}

    public int Sum () {
    	
    	return koreanScore+englishScore+mathScore;
    }
    
    public double getAvg () {
    	return Sum()/3;
    }
    
    public int rank (Student student) {
    	if(this.Sum()<student.Sum()) {
			return -1;
		}else if(this.Sum()==student.Sum()) {
			return 0;
		}else {
			return 1;
		}
    	
    }
    
    
	public static void main(String[] args) {
        Student tony = new Student("Tony", 90, 85, 95);
        Student tiffany = new Student("Tiffany", 88, 92, 90);
        Student jennifer = new Student("Jennifer", 95, 89, 44);
        System.out.println(tony.toString());
        
        int Totaltony = tony.Sum();
        int Totaltiffany = tiffany.Sum();
        int Totaljennifer = jennifer.Sum();
        //총합
        int sumTotal = Totaltony + Totaltiffany + Totaljennifer;
        System.out.println("총합:"+sumTotal);
        System.out.println("----------------------------");
        //평균
        double avgtony = tony.getAvg();
        double avgtiffany = tiffany.getAvg();
        double avgtjennifer = jennifer.getAvg();
        //평균 총합
        double sumAvg = avgtiffany+avgtjennifer+avgtony;
        System.out.println("평균 총합:"+sumAvg);
        System.out.println("----------------------------");
//      System.out.println(avgtony);
        
        Student[] students = { tony, tiffany, jennifer };

        // 학생들을 총합에 따라 정렬
        Arrays.sort(students, (s1, s2) -> {
            int result = Integer.compare(s2.Sum(), s1.Sum());
            if (result == 0) {
        // 총합이 같으면 이름을 기준으로 오름차순 정렬
                result = s1.getName().compareTo(s2.getName());
            }
            return result;
        });
        // 각 학생의 등수를 계산하여 출력
        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].Sum() != students[i - 1].Sum()) {
                rank = i + 1;
            }
            System.out.println(students[i].getName() + "총합:"+students[i].Sum() + " 평균: " + students[i].getAvg() + ", 등수: " + rank);
        }
    }
}
		
		
		
