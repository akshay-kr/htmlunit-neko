/*
 * Copyright (c) 2002-2009 Andy Clark, Marc Guillemot
 * Copyright (c) 2017-2024 Ronald Brill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.cyberneko;

import java.io.StringReader;

import org.htmlunit.cyberneko.html.dom.HTMLDocumentImpl;
import org.htmlunit.cyberneko.parsers.DOMParser;
import org.htmlunit.cyberneko.xerces.xni.parser.XMLInputSource;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link DOMParser}.
 * @author Ronald Brill
 *
 */
public class DOMParserTest {

    /**
     * @throws Exception inc case of error
     */
    @Test
    public void parse() throws Exception {
        final String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"><html xmlns=\"http://www.w3.org/1999/xhtml\"><head><meta name=\"author\" content=\"中国政府采购招标网\" /><title></title><meta name=\"Description\" content=\"国家税务总局山东省税务局2024年行政办公类软件运维服务中标公告-中国政府采购招标网\" /><meta name=\"keywords\" content=\"国家税务总局山东省税务局2024年行政办公类软件运维服务中标公告,中国政府采购招标网\" /><link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\" /><link type=\"text/css\" href=\"css/site-common.css\" rel=\"stylesheet\" />    <script type=\"text/javascript\" src=\"Scripts/masterpage.js\"></script>    <script type=\"text/javascript\" src=\"Scripts/Index_other.js\" charset=\"utf-8\"></script></head><body style=\"margin-top: 0px;\">    <form method=\"post\" action=\"./BidInfoDetails_bid_22042943.html?bid=22042943\" id=\"frmHome\"><div class=\"aspNetHidden\"><input type=\"hidden\" name=\"__VIEWSTATE\" id=\"__VIEWSTATE\" value=\"/wEPDwUKMTY3MTYxMTM5NWRkuAFF5uExPU8tEDZy2+r0xt1UwPzyDLFW1P9Y2qakcdw=\" /></div><div class=\"aspNetHidden\">\t<input type=\"hidden\" name=\"__VIEWSTATEGENERATOR\" id=\"__VIEWSTATEGENERATOR\" value=\"8AC75E25\" /></div>        <div align=\"center\">            <div style=\"width: 800px; height: auto;\">                <table border=\"0px\" cellpadding=\"0px\" cellspacing=\"0px\">                    <tr>                        <td valign=\"top\" align=\"center\">                    <div style=\"width: 800px; line-height: 18pt; float: left; background-color: #0099CB;                        color: #FFFFFF; padding-left: -5px;\">                        <div style=\"float: left; padding-left: 10px;\">                            <script language=\"JavaScript\" type=\"text/javascript\">\t\t\t\t\t\t\t\t\t\tvar today=new Date();\t\t\t\t\t\t\t\t\t\tvar weekday=new Array(7)\t\t\t\t\t\t\t\t\t\tweekday[0]=\"星期日\"\t\t\t\t\t\t\t\t\t\tweekday[1]=\"星期一\"\t\t\t\t\t\t\t\t\t\tweekday[2]=\"星期二\"\t\t\t\t\t\t\t\t\t\tweekday[3]=\"星期三\"\t\t\t\t\t\t\t\t\t\tweekday[4]=\"星期四\"\t\t\t\t\t\t\t\t\t\tweekday[5]=\"星期五\"\t\t\t\t\t\t\t\t\t\tweekday[6]=\"星期六\"\t\t\t\t\t\t\t\t\t\tdocument.write(today.getFullYear(),\"年\",today.getMonth()+1,\"月\",today.getDate(),\"日\",weekday[today.getDay()]);\t\t\t\t\t\t\t\t\t</script>                        </div>                        <div style=\"z-index: 102; width: 44px; position: relative; top: 2px; height: 18px;                            float: left; padding-left: 10px;\">                            <a href=\"javascript:showkefu();\">                                <img src=\"images/qme.gif\" alt=\"客服\" title=\"客服\" style=\"border: 0px;\" />客服</a>                        </div>                        <div style=\"padding-left: 5px; float: left;\">                            |<a target=\"_blank\" href=\"http://www.chinabidding.org.cn/HotItems.html\" style=\"color: #FFFFFF\">标讯</a>| |<a href=\"http://www.chinabidding.org.cn/DownloadList.html\"                                target=\"_blank\" style=\"color: #FFFFFF\">本站服务</a>| |<a href=\"http://114.112.171.210:8082/ReviewList.aspx\" target=\"_blank\"                                    style=\"color: #FFFFFF\">数据回顾</a>| |<a href=\"http://www.chinabidding.org.cn/InfoHelper.html\" target=\"_blank\" style=\"color: #FFFFFF\">知识助手</a>|                            |<a href=\"http://www.chinabidding.org.cn/Policy.htm\" target=\"_blank\" style=\"color: #FFFFFF\">政策法规</a>| |<a href=\"http://www.chinabidding.org.cn/OpFlow.html\"                                target=\"_blank\" style=\"color: #FFFFFF\">发布流程</a>| |<a onclick=\"this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.chinabidding.org.cn')\"                                    style=\"color: #FFFFFF; cursor: pointer;\">设为首页</a>| |<a href=\"javascript:window.external.AddFavorite(window.location,'中国政府采购招标网');\"                                        style=\"color: #FFFFFF\">加入收藏</a>|<a href=\"javascript:showRss();\" style=\"color: #FFFFFF;                                            font-size: 12px;\"> 订阅<img src=\"images/rss.gif\" alt=\"招标订阅\" height=\"10px;\" style=\"border: 0px;                                                margin-top: 5px;\" />                                        </a>                        </div>                    </div>                    <div style=\"float: left;\">                       <table style=\"background-image: url(images/top2.jpg); width: 800px; padding-left: -5px;\">\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\t<td style=\"width: 70%;\">\t\t\t\t\t\t\t\t\t&nbsp;\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t<td align=\"right\">\t\t\t\t\t\t\t\t\t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\"                                        width=\"250px\" height=\"110px\">\t\t\t\t\t\t\t\t\t\t<param name=\"movie\" value=\"flash/4.swf\" />\t\t\t\t\t\t\t\t\t\t<param name=\"quality\" value=\"high\" />\t\t\t\t\t\t\t\t\t\t<param name=\"wmode\" value=\"transparent\" />\t\t\t\t\t\t\t\t\t\t<embed src=\"flash/4.swf\" width=\"250px\" height=\"110px\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\"                                            type=\"application/x-shockwave-flash\" wmode=\"transparent\"></embed>\t\t\t\t\t\t\t\t\t</object>\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t</table>                    </div>                    <center>                        <table style=\"width: 800px; height: 30px; padding-left: -5px; float: left; background-image: url(images/dh.gif);\">                            <tr align=\"center\">                                <td>                                    | <a href=\"http://www.chinabidding.org.cn/index.htm\" target=\"_parent\" style=\"color: #FF0000\">网站首页</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/BidInfoList.html\" target=\"_blank\" style=\"color: #0000FF\">招标公告</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/PurchaseInfoList.html\" target=\"_blank\" style=\"color: #0000FF\">采购公告</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/NewsList.html\" target=\"_blank\" style=\"color: #0000FF\">资讯中心</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/OrgsInfo.html\" target=\"_blank\" style=\"color: #0000FF\">采购机构</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/ProjectNewsList.html\" target=\"_blank\" style=\"color: #0000FF\">项目中心</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/Providers.html\" target=\"_blank\" style=\"color: #0000FF\">供应商库</a>|                                </td>                                <td>                                    |<a href=\"javascript:isLogin();\" style=\"color: #0000FF\">会员中心</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/BidHelper.html\" target=\"_blank\" style=\"color: #0000FF\">招标助手</a>|                                </td>                                <td>                                    |<a href=\"http://www.chinabidding.org.cn/ExpertWorld.html\" target=\"_blank\" style=\"color: #0000FF\">专家库</a> |                                </td>                            </tr>                        </table>                    </center></td>                    </tr>                </table>                <div style=\"text-align: center;\">                        <script type=\"text/javascript\" src=\"Scripts/ajax_common.js\"></script>    <a href=\"http://www.chinabidding.org.cn/zyzx.htm\" target=\"_blank\">       <img src=\"flash/zs01.jpg\" alt=\"中国政府采购招标网-广告\" style=\"border:0px;\" />\t\t\t</a>        <script type=\"text/javascript\" src=\"Scripts/SearchBarCtrl.js\"></script><table style=\"width: 800px; background-image: url(images/barbg.gif);\">    <tr>        <td style=\"color: White; font-weight: bold;\">            信息搜索</td>        <td>             <select name=\"searchType\" id=\"st\" style=\"position: relative; top: 0px;\">                <option value=\"b\">全部招标 </option>                <option value=\"b0\">招标公告 </option>                <option value=\"b1\">招标预告 </option>                <option value=\"b2\">招标动态 </option>                <option value=\"b3\">中标公告 </option>                        <option value=\"p\">全部采购 </option>                <option value=\"p0\">政府采购 </option>                <option value=\"p1\">电子采购 </option>                <option value=\"p2\">企业采购 </option>                <option value=\"p3\">拍卖公告 </option>                        <option value=\"n\">项目中心 </option>                <option value=\"f\">标书下载 </option>                <option value=\"i\">免费信息 </option>        </select>        </td>        <td>                   <select name=\"searchField\" id=\"sf\" style=\"position: relative; width: 90px;\">        <option value=\"0\" selected=\"selected\">行业(不限)</option>        <option value=\"1\">其它</option>        <option value=\"2\">洗涤设备</option>        <option value=\"3\">仪器仪表</option>        <option value=\"4\">工程</option>        <option value=\"5\">通信电缆</option>        <option value=\"6\">舞台照明音响</option>        <option value=\"7\">影视器材</option>        <option value=\"8\">厨房设备</option>        <option value=\"9\">教学设备</option>        <option value=\"10\">体育器材</option>        <option value=\"11\">交通运输物流</option>        <option value=\"12\">IT 网络系统</option>        <option value=\"13\">实验设备</option>        <option value=\"14\">电子电力</option>        <option value=\"15\">食品轻工纺织</option>        <option value=\"16\">办公设备</option>        <option value=\"17\">家居装饰装修</option>        <option value=\"18\">冶金矿产物资</option>        <option value=\"19\">电器</option>        <option value=\"20\">商务科研服务</option>        <option value=\"21\">水利水电桥梁</option>        <option value=\"22\">安防视讯</option>        <option value=\"23\">建筑房产物业</option>        <option value=\"24\">能源化工</option>        <option value=\"25\">出版印刷包装</option>        <option value=\"26\">农林牧渔</option>        <option value=\"27\">市政环保绿化</option>        <option value=\"28\">机械机电</option>        <option value=\"29\">医疗医药</option>         </select>                </td>        <td>                        <select id=\"sd\" name=\"searchDistrict\" style=\"position: relative; width: 90px;\">        <option value=\"0\" selected=\"selected\">地区(不限)</option>        <option value=\"1\">北京</option>        <option value=\"2\">国内</option>        <option value=\"3\">国际</option>        <option value=\"4\">台湾</option>        <option value=\"5\">澳门</option>        <option value=\"6\">香港</option>        <option value=\"7\">云南</option>        <option value=\"8\">江苏</option>        <option value=\"9\">江西</option>        <option value=\"10\">山西</option>        <option value=\"11\">吉林</option>        <option value=\"12\">浙江</option>        <option value=\"13\">安徽</option>        <option value=\"14\">福建</option>        <option value=\"15\">山东</option>        <option value=\"16\">内蒙古</option>        <option value=\"17\">黑龙江</option>        <option value=\"18\">广西</option>        <option value=\"19\">海南</option>        <option value=\"20\">四川</option>        <option value=\"21\">贵州</option>        <option value=\"22\">西藏</option>        <option value=\"23\">陕西</option>        <option value=\"24\">甘肃</option>        <option value=\"25\">青海</option>        <option value=\"26\">宁夏</option>        <option value=\"27\">新疆</option>        <option value=\"28\">河南</option>        <option value=\"29\">河北</option>        <option value=\"30\">重庆</option>        <option value=\"31\">湖北</option>        <option value=\"32\">辽宁</option>        <option value=\"33\">湖南</option>        <option value=\"34\">广东</option>        <option value=\"35\">天津</option>        <option value=\"36\">上海</option>        </select>        </td>        <td><select name=\"tc\" id=\"tc\">                <option value=\"7\" selected=\"selected\">一周之内</option>                        </select>            <select name=\"flag\" id=\"fg\">                <option selected=\"selected\" value=\"keyword\">&nbsp;关键字</option>                <option value=\"num\">项目编号</option>                <option value=\"ournum\">内部编号</option>            </select>                     </td>        <td>            <input name=\"searchKeyword\" id=\"sk\" type=\"text\" style=\"position: relative; width: 180px;\" /></td>        <td>           <input type=\"button\" value=\"搜 索\" onclick=\"return keywordValidate('LuceneSearch.aspx');\" />                    </td>    </tr></table>    <iframe id=\"loginIframe\" src=\"loginBar.htm\" frameborder=\"0\" scrolling=\"no\" width=\"800px\" height=\"25px\"></iframe>     <p id=\"navbar\">        中国政府采购招标网-<a href=\"BidInfoList.html\">招标信息</a>-<a href=\"BidInfoList.html\">中标公告</a>-正文    </p>    <div class=\"doutline\">        <br />        <b><span id=\"cphMain_tle\" style=\"text-align: center; font-size: 14pt;\">国家税务总局山东省税务局2024年行政办公类软件运维服务中标公告</span></b>        <br />        <br />        <div class=\"dtle\">            <a href=\"http://www.chinabidding.org.cn/index.htm\" target=\"_blank\">中国政府采购招标网</a>  第【<span id=\"cphMain_itemId\">22042943</span>】号 发布时间：<span id=\"cphMain_tm\">2024/5/15 22:40:19</span> </div>        <br />        <table id=\"dinfo\" class=\"dfrm\">            <tr align=\"left\">                <td style=\"width: 15%;\">                    项目编号:                </td>                <td>                    &nbsp;                </td>            </tr>            <tr align=\"left\">                <td>                   所在地区:                </td>                <td id=\"dtr\">                    &nbsp;山东                </td>            </tr>            <tr align=\"left\">                <td>                    所属行业:                </td>                <td id=\"fld\">                  &nbsp;其它                </td>            </tr>            <tr align=\"left\">                <td valign=\"top\">                    内容:                </td>                <td id=\"content\">                   &nbsp;为配合中国政府实施《中华人民共和国政府采购法》《中华人民共和国招标投标法》以及规范公共采购市场的需要；现将＂国家税务总局山东省税务局2024年行政办公类软件运维服务中标公告 ＂于 中国政府采购招标网发布公告；以政府采购 招标公告等方式邀请 合格供应商或其他组织参与投标，并向符合条件的投标人中择优选择中标人。                </td>            </tr>             <tr align=\"left\">                <td>                    投标截止时间:                </td>                <td id=\"endDate\">                  &nbsp;-                </td>            </tr>            <tr align=\"left\">                <td>                    附件:                </td>                <td id=\"attach\">                  &nbsp;  附件下载                </td>            </tr>            <tr align=\"left\">                <td>                    备注:                </td>                <td id=\"remark\">                   &nbsp; 有意向的供应商需上网注册成为<a href='CompanyReg.htm'>供应商会员</a>,在线浏览采购 招标文件。\t\t\t                                     </td>            </tr>            <tr style=\"text-align: left;\">            <td>                详情咨询电话:</td>            <td>           <a href=\"javascript:showkefu();\">                                <img src=\"images/qme.gif\" alt=\"客服\" title=\"客服\" style=\"border: 0px;\" />客服</a> 010-68282024 83684022 (中国政府采购招标网) 供应商邮箱:<a href=\"mailto:zfcgzb@gov-cg.org.cn\">zfcgzb@gov-cg.org.cn</a>                </td>        </tr>        </table>        <div style=\"text-align: right; margin-top:6px;\">中国政府采购招标网(www.chinabidding.org.cn)</div>        <br />    </div>    <div style=\"width: 790px; text-align: right;\">        <a href=\"#\" onclick=\"document.execCommand('print');\">[打印本页]</a> <a href=\"javascript:window.close();\">            [关闭窗口]</a>    </div>    <hr style=\"size: 5px; width: 800px;\" />    <br />    <div>        <table style=\"width: 780px; text-align: left;\" class=\"column\">            <tr class=\"rhdr\">                <td colspan=\"2\">                    相关项目:                </td>            </tr>            <tr><td style='width: 80%;'><a target='_blank' href='BidInfoDetails_bid_22042945.html'/>国家税务总局青岛市崂山区税务局2024年教育培训项目终止公告</a></td><td>2024/5/15</td></tr><tr><td style='width: 80%;'><a target='_blank' href='BidInfoDetails_bid_22042943.html'/>国家税务总局山东省税务局2024年行政办公类软件运维服务中标公告</a></td><td>2024/5/15</td></tr><tr><td style='width: 80%;'><a target='_blank' href='BidInfoDetails_bid_22042941.html'/>中华人民共和国黄岛出入境边防检查站公务船运行管理服务采购项目变更公告</a></td><td>2024/5/15</td></tr><tr><td style='width: 80%;'><a target='_blank' href='BidInfoDetails_bid_22042536.html'/>山东省体育中心2024年中国体育彩票杯山东省滑板比赛赛事承办服务C包中标（成交）公告</a></td><td>2024/5/15</td></tr>        </table>    </div>    <br />                </div>                <div style=\"text-align: center;\">                    <hr style=\"size: 5pt; width: 800px;\" />                    <table style=\"width: 800px;\">                        <tr>                            <td>                                | <a href=\"http://www.chinabidding.org.cn/SiteProfile_infId_1.html\" target=\"_blank\">关于我们</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/Advertise/Advertise.htm\" target=\"_blank\">广告服务</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/RecommendEvents_ty_4.html\" target=\"_blank\">展会推荐</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/SiteProfile_infId_4.html\" target=\"_blank\">网站导航</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/OurFriends.html\" target=\"_blank\">友情链接</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/LinkWithUs.html\" target=\"_blank\">自助友情链接</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/OrgFiles.html\" target=\"_blank\">机构文件</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/SiteProfile_infId_5.html\" target=\"_blank\">汇款帐号</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/SiteProfile_infId_6.html\" target=\"_blank\">网站律师</a> |                            </td>                            <td>                                <a href=\"http://www.chinabidding.org.cn/SiteProfile_infId_7.html\" target=\"_blank\">联系我们</a> |                            </td>                        </tr>                    </table>                    <table style=\"width: 800px;\">                        <tr>                            <td>                                <a href=\"index.htm\">中国政府采购招标网</a>&copy;2000-2023 本站网络实名/中文域名：\"<a href=\"http://中国政府采购招标网.中文网/\">中国政府采购招标网.中文网</a>                <a href=\"http://政府采购网.中文网/\">政府采购网.中文网</a>                <a href=\"http://招标网.中文网/\">招标网.中文网</a>\"                            </td>                        </tr>                        <tr>                            <td>                                本网站域名：www.chinabidding.org.cn <a href=\"index.htm\">中国政府采购招标网</a> <img src=\"images/ICP1.png\" /><a href=\"http://www.miibeian.gov.cn/\" target=\"_blank\">京ICP备2021005469</a> <img src=\"images/ICP2.png\" />&nbsp;京公网安备11010602005260                            </td>                        </tr>                        <tr>                            <td>\t\t\t\t\t\t\t   技术支持：北京中政发科学技术研究中心 政府采购信息服务：政采标讯科技（北京）有限公司 All rights reserved<br />                               网站管理：<a href=\"index.html\">政府采购招标中心</a> 联系电话:010-68282024 83684022 传真:010-83684022 <a href=\"SiteProfile_infId_7.html\" target=\"_blank\">\t\t\t\t\t\t\t\t\t\t\t更多联系电话...</a>                            </td>                        </tr>                        <tr>                            <td>                                标讯接收邮箱:<a href=\"mailto:service@gov-cg.org.cn\">service@gov-cg.org.cn</a> 供应商邮箱:<a                                    href=\"mailto:zfcgzb@gov-cg.org.cn\">zfcgzb@gov-cg.org.cn</a>                            </td>                        </tr>                    </table>                </div>                <center>                    <script language=\"javascript\" type=\"text/javascript\" src=\"http://js.users.51.la/3179854.js\"> //</script>                    <noscript>                        <a href=\"http://www.51.la/?3179854\" target=\"_blank\">                            <img alt=\"我要啦免费统计\" src=\"http://img.users.51.la/3179854.asp\" style=\"border: none\" />                           </a>                    </noscript>                    <script type=\"text/javascript\" src=\"Scripts/statistics.js\" charset=\"utf-8\"> //</script>                </center>            </div>        </div>    </form></body></html>";

        System.out.println(html);

        // final InputSource source = new InputSource(new StringReader(html));
        final StringReader sr = new StringReader(html);
        final XMLInputSource source = new XMLInputSource(null, "foo", null, sr, null);

        final DOMParser parser = new DOMParser(HTMLDocumentImpl.class);
        parser.parse(source);

        System.out.println(parser.getDocument());
    }
//
//    @Test
//    void testParseError() throws IOException{
//        String input = "";
//        URL url = getClass().getClassLoader().getResource("error_html.txt");
//
//        String[] lines = Files.lines(new File(url.getPath()).toPath(), StandardCharsets.UTF_8).toArray(String[]::new);
//        for (String jsonStr : lines)
//            if (jsonStr.isEmpty()){
//                continue;
//            }
////            JSONObject jsonObject = null;
////            try {
////                jsonObject = JSONObject.parseObject(jsonStr);
////            }catch (Exception e){
////                continue;
////            }
//
////            String xpath = jsonObject.getString("xpath");
////            String html = jsonObject.getString("html");
//            // final org.htmlunit.cyberneko.parsers.DOMParser parser = CommonUtil.xpathParse.getDomParser(html);
//            // Document document = parser.getDocument();
//        }
}


