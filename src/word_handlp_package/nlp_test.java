package word_handlp_package;


import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.tokenizer.BasicTokenizer;

public class nlp_test {
	
	 public static void main(String[] args)
	 {
	        String text = "�ٰ�������Ƕ�ս��ʷ������ս������������������ѣ���Ϊ�˷�ֹ�������ݣ�ȷ����ƽ��פ��" +
	                "���Ƕ�ս��ʷ������Ϊ�����ѹ�����ᣬ��Ҫ��ͬ������սʤ���ɹ��͹��ʹ�ƽ���壬" +
	                "���뾯��͵�������ʷ��֪��ά��ս��������������ϵĵ�����ʩ��";
	        System.out.println(BasicTokenizer.segment(text));
	        // ���Էִ��ٶȣ��ô�Ҷ�HanLP��������һ��ֱ�۵���ʶ
	        long start = System.currentTimeMillis();
	        int pressure = 100000;
	        for (int i = 0; i < pressure; ++i)
	        {
	            BasicTokenizer.segment(text);
	        }
	        double costTime = (System.currentTimeMillis() - start) / (double) 1000;
	        System.out.printf("BasicTokenizer�ִ��ٶȣ�%.2f��ÿ��\n", text.length() * pressure / costTime);
	    }
}
