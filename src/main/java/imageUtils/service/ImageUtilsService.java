package imageUtils.service;

public interface ImageUtilsService {
    /**
     * 把在线图片转成base64
     * @param imgUrl 网络图片url
     * @return
     */
    public String imageToBase64ByOnline(String imgUrl);

    /**
     * 把本地图片转成base64
     * @param localImgPath 本地图片地址
     * @return
     */
    public String imageToBase64ByLocal(String localImgPath);

    /**
     * base64字符串转换成图片
     * @param imgBase64Str 图片base64字符串
     * @param imgPath 图片存放路径
     * @return
     */
    public boolean Base64ToImage(String imgBase64Str,String imgPath);
}
