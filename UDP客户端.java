/*
 * UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ�Socket����
        DatagramSocket ds = new DatagramSocket();
        //��������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                byte [] by  =line.getBytes();
                //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
                //          �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
                DatagramPacket dp = new DatagramPacket(by,by.length,InetAddress.getByName("192.168.139.1"),10010);
                //����Socket����ķ��ͷ����������ݰ�
                ds.send(dp);
                break;
            }
            byte [] by  =line.getBytes();
            //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            //          �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
            DatagramPacket dp = new DatagramPacket(by,by.length,InetAddress.getByName("192.168.139.1"),10010);
            //����Socket����ķ��ͷ����������ݰ�
            ds.send(dp);
        }

        ds.close();




    }
}