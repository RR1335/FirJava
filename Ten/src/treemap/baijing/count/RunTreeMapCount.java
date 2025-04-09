package treemap.baijing.count;

import java.util.StringJoiner;
import java.util.TreeMap;

public class RunTreeMapCount {
    public static void main(String[] args) {

        String ss = "/Library/Java/JavaVirtualMachines/jdk-17.0.3.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=50538 -Dfile.encoding=UTF-8 -classpath /Users/ann/DJava/JavaModules/JavaPro/FirJava/out/production/Ten treemap.baijing.example.RunTreeMapStu {Student";

        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
//            if (c == ' ') {
//                c = '|';
//            }
            if (tm.containsKey(c)) {
                tm.put(c,tm.get(c)+1);
            } else {
                tm.put(c,1);
            }
        }

        System.out.println(tm);

        StringBuilder sb = new StringBuilder();

        tm.forEach((k,v)->{ sb.append(k).append(" (").append(v).append(")  "); });

        System.out.println(sb);

        StringJoiner sj = new StringJoiner(" "," "," ");

        tm.forEach((k,v)-> sj.add(k + "").add(" (").add(v +"").add(")  ") );

        System.out.println(sj);
    }
}

