/*
/*
 * UDPЭ��������ݣ�
 * A:�������ܶ�Socket����
 * B:����DatagramPacket����������ݣ��������ݽ��
 * C:�ͷ���Դ
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //�������ն�Socket����
        DatagramSocket ds = new DatagramSocket(10010);
        //����Packet���� ����
        while (true) {
            byte[] by = new byte[1024];
            DatagramPacket dp = new DatagramPacket(by, by.length);
            //����socket�������
            ds.receive(dp);
            //��ȡip���Ͷ˵�ip
            String ip = dp.getAddress().getHostAddress();
            //          �������ݻ�������
            String st = new String(dp.getData(), 0, dp.getLength());
            System.out.println("from " + ip + "Data is:" + st);

        }
    }
}