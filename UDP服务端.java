/*
/*
 * UDP协议接收数据：
 * A:创建接受端Socket对象
 * B:创建DatagramPacket对象接受数据，并把数据解包
 * C:释放资源
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        DatagramSocket ds = new DatagramSocket(10010);
        //创建Packet对象 包裹
        while (true) {
            byte[] by = new byte[1024];
            DatagramPacket dp = new DatagramPacket(by, by.length);
            //创建socket对象接受
            ds.receive(dp);
            //获取ip发送端的ip
            String ip = dp.getAddress().getHostAddress();
            //          返回数据缓冲区。
            String st = new String(dp.getData(), 0, dp.getLength());
            System.out.println("from " + ip + "Data is:" + st);

        }
    }
}