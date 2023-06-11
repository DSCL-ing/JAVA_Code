package String;

public class Test {
    public static void main1(String[] args) {

        //str1 ��str2 �ȼ�
        String str1 = "hello";
        String str2 = new String("hello");
        //�ַ�����,û��'\0',��Ҫ����String����ת��
        char[] values = {'a', 'b', 'c', 'd'};
        String str3 = new String(values);
    }

    //String ��
    /**
     * Stringֻ���������Ա
     *
     * ""�ַ�������Ҳ��String����,����ʹ��String����
     */

    public static void main2(String[] args) {
        String str1 = "hello";

        //length:����ַ����ַ�����
        System.out.println(str1.length());//5

        String str2 = "";
        //isEmpty:�ж��ַ����Ƿ�Ϊ0���ַ�,����true,����false
        System.out.println(str2.isEmpty());//true
        /*ע��:����ʹ����str = null; û��ʵ��*/

        //equals:�Ƚ��������������Ƿ�һ��
        System.out.println(str1.equals(str2));//false
        //equalsIgnoreCase:���Դ�Сд�Ƚ϶��������Ƿ�һ��
        System.out.println(str1.equalsIgnoreCase(str2));

        //compareTo:�Ƚ������������ݴ�С,����ascii��򳤶Ȳ�
        System.out.println(str1.compareTo(str2));
         //compareToIgnoreCase:���Դ�Сд�Ƚ������������ݴ�С
        System.out.println(str1.compareToIgnoreCase(str2));

    }

    public static void main3(String[] args) {
        String str1 = "hellohello";

        //��ȡ�ַ����е�ĳ��λ�õ��ַ�
        char ch = str1.charAt(1);
        System.out.println(ch);//e

        //��ȡ�ַ�����ĳ���ַ���һ�γ��ֵ�λ��
        System.out.println(str1.indexOf('e'));//1
        //��ָ��λ�ÿ�ʼ��ĳ���ַ�
        System.out.println(str1.indexOf('o',1));//4
        //ģʽƥ��(���KMP)
        System.out.println(str1.indexOf("ll"));//2

        //�Ӻ���ǰ��ĳ�ַ�,��������λ��
        System.out.println(str1.lastIndexOf('e'));//6
        //������ĳλ�ÿ�ʼ�Ӻ���ǰ��
        System.out.println(str1.lastIndexOf('o',8));//4
        //�Ӻ���ǰģʽƥ��
        //������ĳλ�ÿ�ʼ�Ӻ���ǰģʽƥ��
    }

    public static void main4(String[] args) {
        //����ͬ����ת���ַ���(����ֱ�ӵ��÷���:��̬����)
        String str1 = String.valueOf(1234);
        System.out.println(str1);

        //���ַ�������ת����������(����ֱ�ӵ��÷���:��̬����)
        String str2 = "123";//����ȫ������(ͬһ����),�����쳣
        int value = Integer.parseInt(str2);
        System.out.println(value);

        //��Сдת��
        //str.toUpperCase():ת��д
        //str.toLowerCase():תСд

        //�ַ���ת����(�ַ�����)
        //str.toCharArray()

        //��ʽ�����
        //String.format("%d-%d-%d".2000,1,1).sout;

        //�ַ����滻
        //str.replace('a','b');//�����е�a����b
        //str.replace("ab","cd");//�����е�ab����cd
        //str.replaceAll("ab","cd");//��2һ��
        //str.replaceFirst("a","b");//�滻��һ��

    }

    public static void main5(String[] args) {
        //str.split("regex"):�ַ������(regex:������ʽ)
        System.out.println("=======�ַ���\"�ո�\"���==========");
        String str1 = "how are you";
        String[] strs1 = str1.split(" "); //regexΪString����
        for (String x : strs1) {
            System.out.println(x);
        }

        System.out.println("======���������Ƶ��ַ������===========");
        //str.split("regex",limit):���������Ƶ��ַ������
        String[] strs2 = str1.split(" ", 2);
        for (int i = 0; i < strs2.length; i++) {
            System.out.println(strs2[i]);
        }
        /*���е�n���ֹͣ,���ٷָ�*/

        System.out.println("=========.�ָ���========");
        //ת��
        String str3 = "192.168.0.1";
        String[] strs3 = str3.split("\\.");
        for (String x : strs3) {
            System.out.println(x);
        }

        System.out.println("=======\"//\"�ָ���==========");
        String str4 = "192\\168\\1";
        String[] strs4 = str4.split("\\\\");
        for (String x : strs4) {
            System.out.println(x);
        }

        System.out.println("========��ͬ�ָ��=========");
        String str5 = "192&168=1";
        String[] strs5 = str5.split("&|=");
        for (String x : strs5) {
            System.out.println(x);
        }
        /**
         * "."��������ʽ���������(ͨ���),��Ҫת��������Ϊ��ͨ����,"\."�ʹ�����ͨ����,��д��"\\."
         * ���д��"\."�ǲ��Ե�,��Ϊû��\.���ת���ַ�,�ǷǷ�ת���ַ�,�ᱨ��;Ҳ��������ͨ���Ź���
         * ����һЩ�������,��"|", "*", "+", "\"
         * "\"��Ҫд��"\\\\"
         * ����ָ����"|"�ָ�
         */

        //��β��
        System.out.println("======��β��===========");
        String str6 = "name=zhangsan&age=18";
        String[] strs6 = str6.split("&");
        for (String s : strs6) {
            String[] strings = s.split("=");
            for (String ss : strings ) {
                System.out.println(ss);
            }
        }

    }

    public static void main6(String[] args) {//6
        //str.substring(n)�ַ�����ȡ
        System.out.println("=======�ַ�����ȡ============");
        String str1 = "abcdefgh";
        String s1 = str1.substring(2);//��2λ�ÿ�ʼ��ĩβ
        System.out.println(s1);

        //str.substring(n,m):�ַ��������ȡ[)
        System.out.println("=======�ַ��������ȡ============");
        String s2 = str1.substring(2, 6);//����ҿ�,cdef
        System.out.println(s2);

        //str.trim():ɾ���ַ����������߿ո�(�м�ո񲻶�) //trim:�޼�
        System.out.println("=======ɾ���ַ����������߿ո�============");
        String str3 = "     hello           ";
        String s3 = str3.trim();
        System.out.println(s3);
    }


    //������
    /**
     * ��""���ַ����������ǲ����޸ĵ�,������ַ�����������
     *
     * �ٷ�û�ж����ַ���������
     * �ַ��������صײ��ǹ�ϣ��StringTable(C++��)
     *
     * �����ش���ڶ���
     *
     * ��������ʱ,��"���"�������Ƿ����,�������򴴽�,�������ٴ���
     *
     * ������:
     * a.�����new��ͬһ�����ݵĳ���,����ڶ��п���һ�����ó����صĿռ�:�����Ѵ���,���п��ٸ�����,ջ�����öѵ�����
     * b.�������new��ͬһ�����ݵĳ���,��ֱ����ջ��������
     */

    //�ַ������������޸ĵ�ԭ��
    /**
     * ԭ��:String���ַ�����value�Ǳ�private��װ��,���ʲ���.
     * ��������Ϊfinal,final���Ƶ���value���ܸ������ö���,����const
     */

    //ΪʲôString��Ƴɲ��ɱ��?����ѧ�߳̽���

    //Stringƴ��Ч�ʷǳ���,��ʹ��(��������ѭ����ʹ��ƴ��)


    public static void main(String[] args) { //7
        //StringBuilder:
        /**
         * ֱ�Ӵӳ�������ȡ��,����ʱ����,Ч��
         * StringBuilder�����ݿ����޸�
         */

        //���ַ���תΪStringBuilder
        StringBuilder stringBuilder = new StringBuilder("hello");

        //StringBuilder.append():�ַ���׷��ƴ��
        System.out.println("======�ַ���׷��ƴ��=============");
        stringBuilder.append(" world");
        stringBuilder.append("!");
        System.out.println(stringBuilder);

        //reverse
        System.out.println("======�ַ�������=============");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();

        //��StringBuilderתΪString
        System.out.println("=====��StringBuilderתΪString==============");
        String str1 = stringBuilder.toString();
        System.out.println(str1);

        //Builder��buffer�����ڶ��߳�,��,��ô��

    }

}
