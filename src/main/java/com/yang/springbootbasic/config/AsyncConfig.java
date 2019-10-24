@Self4j
@EnableAsync
@Configuration
public class AsyncConfig {
    private static final CORE_SIZE  = 8;
    private static final MAX_SIZE  = 16;
    private static final Integer QUEUE_CAPACITY = 128;
    private static final Integer KEEP_ALIVE_SECOND = 360;
    private static final String THREAD_PREFIX = "my_async_"; 
    
    public ThreadPoolTaskExecutor AsyncThreadPoolTaskExecutor() {
      ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
      
      1.配置线程池静态参数
      pool.setCorePoolSize(CORE_SIZE);
      pool.setMaxPoolSize(MAX_SIZE)
      pool.setQueueCapacity(QUEUE_CAPACITY);
      pool.setKeepAliveSeconds(KEEP_ALIVE_SECOND);
      pool.setThreadNamePrefix(THREAD_PREFIX);
      
      2.配置拒绝策略
      pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
      3.等待池内任务完成才关闭池
      pool.setWaitForTaskToCompleteOnShutdown(true);
      4.配置池关闭前的等待时间
      pool.setAwaitTerminationSeconds(60);
      pool.initialize();
      
      log.info("async thread pool has initialized!");
      return pool;
    }
}
