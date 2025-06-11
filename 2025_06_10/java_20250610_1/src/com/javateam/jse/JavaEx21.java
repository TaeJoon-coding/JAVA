package com.javateam.jse;

public class JavaEx21 {
	// String [] args : //外部인자
			// java(.exe) JavaEx21(.class) 인자1 인자2 인자3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 外部인자入力 =>
		// Run Configurations => Java Application => 追加 => Arguments(인자) => Variables => String_prompt
		// ${String_prompt}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
