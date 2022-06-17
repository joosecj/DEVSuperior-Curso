package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> lessonList = new ArrayList<>();

        System.out.print("Quants aulas tem o curso? ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.println("Dados da " + i +"º aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            while (ch != 'c' && ch != 't'){
                System.out.print("Dados inválidos, favor digitar novamente (c/t): ");
                ch = sc.next().charAt(0);
            }
            sc.nextLine();
            System.out.print("Título: ");
            String title = sc.nextLine();
            if (ch == 'c'){
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                lessonList.add(new Video(title, url, seconds));
            }else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int question = sc.nextInt();
                lessonList.add(new Task(title, description, question));
            }
        System.out.println();
        }

        int sum = 0;
        for(Lesson list : lessonList){
            sum += list.durantion();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");

        sc.close();
    }
}
