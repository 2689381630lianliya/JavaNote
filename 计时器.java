public class MyTimer {
    public static void main(String[] args) throws ParseException {
      //建应该计时器
        Timer t = new Timer("计时器1");
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String time = "2020-05-23  19:39:30";
		//在指定时间执行
        Date date1 = date.parse(time);
		//在多少时间后执行，再在多少时间后重复执行
       // t.schedule(new MyTimerTask(10),3000,3000);
        t.schedule(new MyTimerTask(10),date1);
        System.exit(0);

    }
}
class MyTimerTask extends TimerTask {
    private int cont =0;
    private int number =0;
    public MyTimerTask(){

    }
    public MyTimerTask(int number){
     this.number=number;
    }
    @Override
		//要执行的任务
    public void run() {
        for (int i =0;i<number;i++){
            cont+=i;
        }
        System.out.println(cont);

    }