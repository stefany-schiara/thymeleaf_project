package br.com.schiara;

import java.io.File;

public class RenameFileExtensions {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Stefany Schiara\\Desktop\\Emuladores\\mega drive\\ROMS\\";
		File diretorio = new File(path);
		File[] arquivos = diretorio.listFiles();
		
		String extensao = ".bin";
		
		for (File file : arquivos) {
			String nome = file.getName();
			
			File novoNome = new File(path + nome.substring(0, nome.indexOf(".")) + extensao);
			
			file.renameTo(novoNome);
			
			//System.out.println(novoNome);
		}
		
		
		//diretorio.renameTo(new File(path.replace(".md", ".bin")));

	}

}
