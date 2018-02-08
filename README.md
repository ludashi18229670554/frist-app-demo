# frist-app-demo
web flux
/**
     * Servlet
     * 请求接口：ServletRequest 或者 HttpServletRequest
     * 响应接口：ServletResponse 或者 HttpServletResponse
     * Spring 5.0 重新定义了服务请求和响应接口
     * 请求接口：ServerRequest
     * 响应接口：ServerResponse
     * 既可支持Servlet 规范，也可以支持自定义，比如 Netty (web Server)
     * 以本例
     * 定义GET请求，并且返回所有的用户对象 URI:/person/find/all
     * Flux 是0-N个对象集合
     * Mono是0-1个对象集合
     * Reactive中的Flux或者Mono它是异步处理（非阻塞）
     * 集合对象基本上都是同步处理（阻塞）
     * Flux 或者Mono都是Publisher
     */
