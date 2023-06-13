package �쳣;

public class Test {

    /** note
     *
     *
     *
     *
     *
     * �쳣��Ϊ:
     * 1.����ʱ�쳣/�ܲ��쳣/�ܼ���쳣IOException:
     * �ص�:����,����ͨ������(���߲���������쳣,Ҳ������"�﷨����")
     * 2.����ʱ�쳣/���ܲ��쳣RuntimeException:
     *
     * ���е�����ʱ�쳣/���ܲ��쳣���̳�����RuntimeException
     * ���еı���ʱ�쳣/�ܲ��쳣���̳�����IOException
     *
     * ����ʱ�쳣�����ڱ�����ʱ�����
     *
     *
     */

    //�쳣����ϵ�ṹ:(������)
    /** �쳣���෱�࣬Ϊ�˶Բ�ͬ�쳣���ߴ�����кܺõķ������Java�ڲ�ά����һ���쳣����ϵ�ṹ��
     *
     * throwable{
     *      1.Error
     *      2.Exception{
     *          a.IOExcepion{
     *              ��EOFException
     *              ��FileNotFoundException
     *              ��MalformedURLException
     *              ��UnknownHostException
     *          }
     *          b.ClassNotFoundException
     *          c.CloneNotSupportedException
     *          d.RuntimeException{
     *              ��ArithmeticException
     *              ��ClassCastException
     *              ��IIIegalArgumentException
     *              ��IndexOutOfBoundzException
     *              ��NoSuchElementExcepion
     *              ��NullPointerException
     *          }
     *      }
     * }
     *
     * 1.Throwable�����쳣��ϵ�Ķ����࣬��������������Ҫ������, Error �� Exception
     * 2.Error��ָ����Java������޷�������������⣬���磺JVM���ڲ�������Դ�ľ��ȣ����ʹ���
     *   StackOverflowError��OutOfMemoryError��һ����������������
     * 3.Exception���쳣���������Ա����ͨ��������д���ʹ�������ִ�С����磺��ð�����ա�����ƽʱ��˵
     *   ���쳣����Exception��
     *
     *
     *
     *
     */

    //java.lang.ArithmeticException:�����쳣
    public static void main1(String[] args) {//1
        //RuntimeException
        System.out.println(10 / 0);
    }

    //java.lang.NullPointerException :��ָ���쳣:
    public static void main2(String[] args) {//2
        //RuntimeException
        int[] array = null;
        System.out.println(array.length);
    }

    //java.lang.ArrayIndexOutOfBoundsException :����Խ���쳣
    public static void main(String[] args) {//3
        //IndexOutOfBoundsException
        int[] array = {1, 2, 3};
        System.out.println(array[10]);
    }

    //�쳣�Ĵ���
    /**
     * 1.����ʽ��� LBYL:Look Before You Leap
     * ÿһ���������.����һ��ǰ���뱣֤ÿһ�����ǳɹ���.
     * ȱ��:�������̺ʹ��������̴������һ��,���������ԵñȽϻ���
     *
     * 2.�º��ϴ��� EAFP:It's Easier to Ask Forgivenss than permission
     * �Ȳ���,���������ټ��д���
     * ����:�������̺ʹ��������Ƿ��뿪��,���������,���������
     *
     * �쳣����ĺ���˼�����EAFP
     *
     * java��,�쳣������Ҫ��5���ؼ���:throw,try,catch,final,throws
     *
     * �쳣�����ǰ��:����/�׳��쳣
     * 1.�����Լ�ִ�й����д����쳣
     * 2.�Լ��ֶ��׳��쳣:throw:��
     *
     * (�׳��쳣����Ϣ:������/��һ����ֱ���׳��쳣��λ��,�����ط��Ǽ��λ��)
     * �׳����쳣��һ����
     * �׳��쳣��,����������κδ���,�������κ��쳣���ύ��JVM����:��ֹ����
     *
     * throw:
     * 1.һ�㶼�������Լ��Զ�����쳣��
     * 2.throw����д�ڷ������ڲ�
     * 3.�׳��Ķ��������Exception����Excepion������
     * 4.����׳�����RunTimeException����RunTimeException������,����Բ��ô���,ֱ�ӽ���JVM������
     * 5.����׳����Ǳ���ʱ�쳣,�û����봦��,�����޷�ͨ������
     * 6.�쳣һ���׳�,���Ĵ���Ͳ���ִ��
     *
     * �쳣�Ĳ���:��Ҫ������:�쳣����throws��try-catch������
     *
     *
     * throws:�����׳����쳣(����ܲ��쳣)
     * ˵��:���ڷ��������Ĳ����б�֮��,���������׳�����ʱ�쳣,�û����봦����쳣,��ʱ�Ϳ��Խ���throws���쳣
     * �׸������ĵ�����������.����ǰ�����������쳣,���ѷ����ĵ����ߴ����쳣
     * 1.throws������ڷ����Ĳ����б�֮��
     * 2.�������쳣������Exception����Exception������
     * 3.�����ڲ�����׳��˶���쳣,throws֮����������쳣����,֮���ö��Ÿ���,����׳�����쳣���;��и��ӹ�ϵ
     * ,��ֱ���������༴��
     *
     */



}
