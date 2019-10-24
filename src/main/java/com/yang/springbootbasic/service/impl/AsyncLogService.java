@Slef4
public class AsyncLogService {

  @Async("logPool")
  public void printLog() {
    log.info("00000000");
  }
  
  @Async("logPool")
  public FutureTask<String> printLog() {
    log.info("1111111111");
    return new AsyncResult<String>("1111111");
  }

}
