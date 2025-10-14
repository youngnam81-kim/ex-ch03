package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Ex3Service {

	Logger log = LoggerFactory.getLogger(Ex3Service.class);
	
	public String sayHello() {
		System.out.println("sayHello");
		log.info("안녕 좋은날");
		log.error("안녕 좋은날");
		log.debug("안녕 좋은날");
		
		return "sayHello 안녕";
	}
	
	public String ex321(int number){
		String msg = "1, 2, etc 중 선택 : ";
        if (number == 1) {
            msg += "if 블록입니다.";
        } else if (number == 2) {
        	msg += "else if 블록입니다.";
        } else {
        	msg += "else 블록입니다.";
        }
        
        return msg;
	}

	public String[] ex322() {
		int[] array = {1, 2, 3, 4, 5};

		String[] msg = new String [array.length] ; 
		//String msg = "";
		
        for (int i = 0; i < array.length; i++) {
            msg[i]="i = " + array[i];
            //msg += "i = " + array[i]+", ";
        }
		return msg;
	}

	public String ex323() {
		int[] array = {1, 2, 3, 4, 5};
		int i = 0;
		String msg = "";
		
		while ( i < array.length) {
			if (i == array.length-1) {
				msg += "i = "+ array[i];
			}else {
				msg += "i = "+ array[i]+"<br>";	
			}
			i++;
		}
		log.info(msg);
		return msg;
	}
	
	public interface Car {
		public String getColor();
	}
	
	public class Sonata implements Car {
		public Sonata() {
			log.info("소나타 생성자 출고");	
		}
		
		@Override
		public String getColor() {
			return "색상 : RED 소나타 ";
		}
	}
	
	public class K5 implements Car {
		public K5() {
			log.info("K5 생성자 출고");
		}
		
		@Override
		public String getColor() {
			return "색상 : BLUE K5 ";
		}
	}
	
	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
        Car car2 = new K5();
        String re2 = car2.getColor();
        String result = re1+"출고 <br>"+ re2+"출고 <br>"+"두 대의 차를 출고 하였음.";
        
        return result;
	}

	public String ex325(int number) {
		List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        log.info(list.get(number).toString());
        return list.get(number).toString();
	}

	public String ex326() {
		List<String> list = new ArrayList<String>();
		
		list.add("public");       // ["public"]
        list.add("static");       // ["public", "static"]
        list.add("void");         // ["public", "static", "void"]
		
        for (int i = 0; i < list.size(); i++) { // list.size()는 리스트의 크기를 반환한다.
//            System.out.println(list.get(i));    // i번째 요소가 출력된다.
        }
        
        //list.remove(1);     // 1번째 요소인 "static"이 제거된다. -> ["public", "void"]
        int voidIndex = list.indexOf("void");
        
        log.info("리스트 내용: {}", list);
		return "void의 index = " + voidIndex;
	}

	public String ex327() {
	    String msg = "";
		
		String str1 = new String("is same?");
	    String str2 = new String("is same?");

	    System.out.println(str1 == str2); // true or false?
	    System.out.println(str1.equals(str2)); // true or false?
	    
	    msg = "str1 == str2 : "+ (str1 == str2) +"<br>";
	    msg += "str1.equals(str2) : " + (str1.equals(str2))+"<br>";
	    msg += "ex327+ex328 참조형일경우 equals로 비교.";
	    
		return msg;
	}

	public List<?> ex331() {
		List<String> list = new ArrayList<>();
		
		list.add("static");
		list.add("void");
		list.add("public");
        
        list.sort(new Comparator<String>() {
        	@Override
        	public int compare(String str1, String str2) {
        		return str1.compareTo(str2);
        	}
		});
        
        log.info(list.toString());
        list.sort((Comparator<String>) (str1 ,str2) -> str1.compareTo(str2));
        
        log.info(list.toString());
		return list;
	}

	public StringBuilder ex332() {
		List<String> list = new ArrayList<>();
		
		list.add("static");
		list.add("public");
        list.add("void");

        StringBuilder msg = new StringBuilder();
        
        list.stream().forEach(
        		str-> msg.append(str+"<br>") 
        		);
        
		return msg.append("StringBuilder 사용해봅니다.");
	}

	public String ex333() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(integerArray);
		List<Integer> evenList = new ArrayList<Integer>();
		String msg="";
		
		for (int i=0; i<list.size();i++) {
			int number = list.get(i);
			if(number%2==0) {
				evenList.add(number);
			}
		}

		for (int i = 0; i < evenList.size(); i++) {
            log.info(evenList.get(i).toString());
        }
		
		log.info(evenList.toString());
		msg += evenList.toString();
		
		return msg;
	}
	

	public StringBuilder ex334() {
		Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list = Arrays.asList(integerArray);
		
		List<Integer> evenList = list.stream()
				.filter(value -> value%2==0).collect(Collectors.toList());
		
		StringBuilder msg = new StringBuilder();
		
		evenList.stream().forEach(value -> msg.append(value).append("<br>"));
		
		log.info(msg.toString());
		return msg;
	}
	
	public StringBuilder ex335() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(integerArray);
		StringBuilder msg = new StringBuilder();
		
		list.stream().forEach(value -> msg.append(value+"<br>"));
		return msg;
	}

	public String ex337() {
		Integer[] integerArray = new Integer[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
		List<Integer> list = Arrays.asList(integerArray);
		List<Integer> distinctList = list.stream().distinct().toList();
		
		log.info(distinctList.toString());
		return distinctList.toString();
	}
	
	public String ex338() {
		String[] lowercaseArray = new String[]{"public", "static", "void"};
		List<String> lowercaseList = Arrays.asList(lowercaseArray);
        List<String> uppercaseList = lowercaseList.stream()
                .map(value -> value.toUpperCase()).toList();
		
		log.info(uppercaseList.toString());
		return uppercaseList.toString();
	}
	
	public String ex3310() {
		String isThisNull = getSomeString3310();
		if(null != isThisNull) {
            System.out.println(isThisNull.toUpperCase());
        }
		return "이 예제는 문자열이 null이라서 대문자로 변환할 수 없습니다. java.lang.NullPointerException 을 냅니다.";
	}
	private String getSomeString3310() {
        return null; // 이 메서드는 항상 null을 반환한다.
    }

	public String ex3311() {
		Optional<String> isThisNull = getSomeString3311();
		isThisNull.ifPresent(str -> System.out.println(str.toUpperCase()));
		return "이 라인이 Optional 사용의 핵심이자 NullPointerException을 방지하는 지점입니다.<br>"
				+ "ifPresent() 메서드는 Optional 객체 내부에 실제로 값이 존재할 경우에만 괄호 안에 있는 람다 표현식 <br> "
				+ "(여기서는 str -> System.out.println(str.toUpperCase()))을 실행합니다.<br>"
				+ "현재 isThisNull은 Optional.empty() 상태, 즉 내부에 값이 없습니다. <br>"
				+ "따라서 ifPresent() 메서드는 이 람다식을 실행하지 않습니다.<br>"
				+ "결과적으로 str.toUpperCase()라는 코드는 전혀 호출될 기회조차 없어집니다.";
	}
	private Optional<String> getSomeString3311(){
		return Optional.empty();
	}	
	
	public StringBuilder ex3312() {
		Optional<String> isThisNull = getSomeString3312();
		isThisNull.ifPresent(string -> log.info(string.toUpperCase()));
		StringBuilder msg = new StringBuilder();
		isThisNull.ifPresent(string -> msg.append(string.toUpperCase()));
		return msg;
	}
	private Optional<String> getSomeString3312(){
		return Optional.ofNullable("public static void");
	}
	
	public StringBuilder ex3313() {
		StringBuilder msg = new StringBuilder();
		Optional<String> str = getSomeString3312();
		if(str.isPresent()) {
			log.info(str.get().toUpperCase());
			msg.append(str.get().toUpperCase());
		}
		return msg;
	}
	
	public StringBuilder ex3314() {
		StringBuilder msg = new StringBuilder();
		Optional<String> str = getSomeString3312();
		str.ifPresent((string)-> log.info(string.toUpperCase()));
		str.ifPresent((string)-> msg.append(string.toUpperCase()));
		return msg;
	}
	
	
}
