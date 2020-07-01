/*
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                byte [] by  =line.getBytes();
                //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
                //          构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
                DatagramPacket dp = new DatagramPacket(by,by.length,InetAddress.getByName("192.168.139.1"),10010);
                //调用Socket对象的发送方法发送数据包
                ds.send(dp);
                break;
            }
            byte [] by  =line.getBytes();
            //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            //          构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
            DatagramPacket dp = new DatagramPacket(by,by.length,InetAddress.getByName("192.168.139.1"),10010);
            //调用Socket对象的发送方法发送数据包
            ds.send(dp);
        }

        ds.close();




    }
}