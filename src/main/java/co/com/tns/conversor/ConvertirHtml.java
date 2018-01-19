package co.com.tns.conversor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ConvertirHtml {

	public List<String> convertir(String string) {
		String cadenaEspacio = string.substring(0, 1);
		if(!cadenaEspacio.equals(" ")) {
			return Arrays.stream(string.split(" ")).collect(Collectors.toList());
		}
		else {
			return null;
		}
	}
	public boolean validarTamanoDeLaCadena(String header) {
		return header.length()<7;
	}

	public boolean contarNumeroDeNumerales(String header) {
		char[] arreglonumerales = header.toCharArray();
		for(int i=0;i<arreglonumerales.length;i++)
		{
			if(arreglonumerales[i]=='#')
			{
			
			}
			else
			{
				return false;
			}
				
			
			
		}
		
		return true;
	}

	public int MostrarEtiqueta(String header) {
		int  contador=0;
		char[] arreglonumerales = header.toCharArray();
		for(int i=0;i<arreglonumerales.length;i++)
		{
			if(arreglonumerales[i]=='#')
			{
				contador++;
			}
			else
			{
				break;
			}
				
			
			
		}
		
		switch(contador) {
		case 1: header = "<H1>" + header + "</H1>";
		        header = header.replaceAll("# ", "");
				System.out.println(header);
				break;
		case 2: header = "<H2>" + header + "</H2>";
		header = header.replaceAll("## ", "");
		System.out.println(header);
		break;
		case 3: header = "<H3>" + header + "</H3>";
		header = header.replaceAll("### ", "");
		System.out.println(header);
		break;
		case 4: header = "<H4>" + header + "</H4>";
		header = header.replaceAll("#### ", "");
		System.out.println(header);
		break;
		case 5: header = "<H5>" + header + "</H5>";
		header = header.replaceAll("##### ", "");
		System.out.println(header);
		break;
		case 6: header = "<H6>" + header + "</H6>";
		header = header.replaceAll("####### ", "");
		System.out.println(header);
		break;
		case 7: 
		System.out.println(header);
		break;
		}
		return 1;
	
		
		
	}

	

	
		

}
