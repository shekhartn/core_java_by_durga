package com.durga.datatypes;

public class DataTypesChecks {
	

	//NUMERIC DATA TYPES REPRESENTS NUMBERS
	byte b=127;//1 byte should not use more than 127
	short s=32767;// 2 bytes should not use more than 32767
	int i= 2147483647; // 4 bytes should not use more than 2147483647
	long l= 2147483647; // 8 bytes 
	
	float f1=10.123456791911118f;//4 bytes Need to specify explicitly float type
	float f2=10;
	float f3=010;
	float f4=0x10;
	
	double d=11.7e11d;//8 bytes no Need to specify explicitly float type
	double d1=11;
	double d2=011;
	
	//BOOLEAN DATA TYPES REPRESENTS LOGICALS
	boolean boo=true ;//or false
	
	//CHAR DATA TYPES REPRESENTS CHARACTERS
	char c='r'; // 2 bytes
	char c1=109;// unicode of character should not use more than 65536
	char c2=0x109;// unicode of character
	char c3=0xFACE;// unicode of character
	
	char c4='\u0056';// unicode of character
	char c5='\t';// unicode of character
	char c6='\n';// unicode of character
	char c7='\'';// unicode of character
	
	//LITERALS
	int i1=10; //decimal literals 0-9
	int i2=020; //octal literals  0-7 and should starts with 0
	byte i5=020; //octal literals  0-7 and should starts with 0
	byte i6=0x20; //octal literals  0-7 and should starts with 0
	int i3=0x20; //Hexa decimal literals  0-9,a-f & A -F and should starts with 0x
	int i4=0xaBcD; //Hexa decimal literals  0-9,a-f & A -F and should starts with 0x
			
	
	public static void main(String[] args) {
		DataTypesChecks dataTypes=new DataTypesChecks();
		System.out.println("Double::"+dataTypes.d);
		System.out.println("Char 1::"+dataTypes.c);
		System.out.println("Char 2::"+dataTypes.c1);
		System.out.println("Char 3::"+dataTypes.c2);
		System.out.println("Char 3::"+dataTypes.c3);
		System.out.println("Char 4::"+dataTypes.c4);
		System.out.println("Char 5::"+dataTypes.c5);
		System.out.println("Char 6::"+dataTypes.c6);
		System.out.println("Char 7::"+dataTypes.c7);
		
		
		System.out.println("INTEGRAL LITERALS");
		System.out.println("DECIMAL:"+dataTypes.i1);
		System.out.println("OCTAL ::"+dataTypes.i2);
		System.out.println("OCTAL2 ::"+dataTypes.i5);
		System.out.println("HEXA DECIMAL::"+dataTypes.i3);
		System.out.println("HEXA DECIMAL2::"+dataTypes.i4);
		
		
		

	}

}
