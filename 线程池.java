 //创建线程池，连接池中有多个线程，每一个线程都可以处理一次连接
    private ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	                                                                              //返回系统所能承受的执行器数量
					 //执行线程                                                           
    executor.execute(new Runnable() {
		//任务
    }