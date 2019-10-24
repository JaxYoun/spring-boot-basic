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
      pool.setCorePoolSize(CORE_SIZE);
      pool.setMaxPoolSize(MAX_SIZE)
      pool.setQueueCapacity(QUEUE_CAPACITY);
      pool.setKeepAliveSeconds(KEEP_ALIVE_SECOND);
      pool.setThreadNamePrefix(THREAD_PREFIX);
    }
}
