package adobeSign;

import com.mashape.unirest.http.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UtilRunner {
    public static void main(String []args) throws Exception{
//        Unirest.setTimeouts(0, 0);
//        HttpResponse<String> response = Unirest.get("https://api.na1.echosignawspreview.com:443/api/rest/v6/webhooks?Authorization=Bearer%203AAABLKmtbUC8NMf6SXhvdY2AYadyl0lxW-mCe3quamzluAASYIdz9Bm-nr1oSr9s-oclRvYHsvnXNcFydTSRAOehbn30_Uzu")
//                .header("Authorization", "Bearer 3AAABLKmtbUCcPXH4St9IgZY2wXJnp_wU3dpP15jKLX_v5ispDXb-COPWRiWZ14ymtlA3qp-MYFw*")
//                .asString();
//
//        System.out.println(response.getBody());
//        JSONParser parser = new JSONParser();
//        JSONObject json = (JSONObject) parser.parse(stringToParse);

        String string = "{\n" +
                "  \"userWebhookList\": [\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAsHo8a-BzOmgjp2l5ggEY-bl95AOSb1D-\",\n" +
                "      \"lastModified\": \"2021-06-02T00:05:43Z\",\n" +
                "      \"name\": \"ab399482-e51a-43d1-aa81-e8175e05ce75\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=32c897ae-a2cf-4ae0-8166-ae55620979fc\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAA2RI_Z850a6XlhCalP4STeCNDkaWg45_\",\n" +
                "      \"lastModified\": \"2021-06-01T22:36:59Z\",\n" +
                "      \"name\": \"210abf78-ab82-4eb1-9970-7599c18c671c\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://20f9855abf15d33961d1985b4ea51f05.m.pipedream.net\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAu01DeAY1jiY24yNt62ZDdw1EbGTehSk3\",\n" +
                "      \"lastModified\": \"2021-06-01T22:16:22Z\",\n" +
                "      \"name\": \"e2edd25d-3413-4fe1-add6-75523a164d2d\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=8446d062-d880-4b36-8341-430b84bf9652\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAhTMEEYu54kI5CZ7sJiGa0mcNg5mSTXxZ\",\n" +
                "      \"lastModified\": \"2021-06-01T22:03:14Z\",\n" +
                "      \"name\": \"e92d871e-15ad-4fe7-97f4-805ae473e9b6\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=52bce935-3326-4670-80db-d5cf8d07e430\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA29b0YYVmgYjExcucC2byhZziDJgLA1GI\",\n" +
                "      \"lastModified\": \"2021-06-01T22:01:22Z\",\n" +
                "      \"name\": \"f34d7abe-f4b4-49de-ae9b-48d102186e1a\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=28678cee-5c80-4d9d-a790-091371f17ef2\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA0QFhmbH7qwuS1m_ZQYgWfvBPL8Q2DFQo\",\n" +
                "      \"lastModified\": \"2021-06-01T21:27:22Z\",\n" +
                "      \"name\": \"2ea0baae-366a-4d04-91bf-807449db331e\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=7a8ba48a-ac9b-4d6d-a747-50ccd123d745\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAD9RlmhRL0bIQGwaVBGS_sjaE-nYFjy0Z\",\n" +
                "      \"lastModified\": \"2021-06-01T21:04:11Z\",\n" +
                "      \"name\": \"3fe1f0fe-89e4-4a13-8c32-08631ec4ce87\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=8b687256-b805-4546-a7b9-b0aeffba61f7\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAApbJ78MhKmEr98t_oZ9SbNg6MKu4ugNXH\",\n" +
                "      \"lastModified\": \"2021-06-01T21:01:00Z\",\n" +
                "      \"name\": \"9143ae60-28e0-45c6-9bb2-000392f3026e\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=5f11314a-7f6a-404b-968a-ae5d3d1632a7\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAbSFVjUEYoy4WYPvEeVEGRd2vyrW659nl\",\n" +
                "      \"lastModified\": \"2021-06-01T20:58:27Z\",\n" +
                "      \"name\": \"69beeaff-3808-4bf8-9602-5f892408ff15\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=cd9a37cb-3c0e-46a6-b8ae-e72a6709fda5\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA9DCzznQHNryMB5YqksrC24UyapdWu-6h\",\n" +
                "      \"lastModified\": \"2021-06-01T20:55:39Z\",\n" +
                "      \"name\": \"48306732-337d-42dd-a64d-45df1aef42b3\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=1556536e-5ceb-4fa4-9f9c-9a4086db2a34\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAUnrbrB81HVIctQNgWeDTrlHu-TZ-ZfWO\",\n" +
                "      \"lastModified\": \"2021-06-01T20:49:36Z\",\n" +
                "      \"name\": \"30d9951f-9302-4ea7-8600-ff9d7e209d15\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=2c6ccdd4-5ecc-4942-9bd0-f6d638ad64bd\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAjQxQzgj5rU5LHDuhrmNxvF-3BK_INXyE\",\n" +
                "      \"lastModified\": \"2021-06-01T20:45:17Z\",\n" +
                "      \"name\": \"e3b2b1e7-c62d-4ca0-8156-5df3b6ca0f3d\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=9d717c0c-226e-4da2-b16e-818c59a47503\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA0uvx7neGq24rwSX_S0vje56bqCLDnQRL\",\n" +
                "      \"lastModified\": \"2021-06-01T20:42:52Z\",\n" +
                "      \"name\": \"a5a1f246-3844-46d5-893e-e51155533577\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=fb3de77f-3b44-4ea2-96ce-09c67d8fe9fa\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA6HwL0pCU5Vj7aov5t0TTOhk4tZcurKpq\",\n" +
                "      \"lastModified\": \"2021-06-01T20:41:32Z\",\n" +
                "      \"name\": \"56dd4780-d5c4-4ac0-82d6-181de923ecdd\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=0e4045ff-9fd4-4f7d-a522-74fc62696f82\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAGVtiJAle3xBczGvk7PzcpXvfbii2gIjQ\",\n" +
                "      \"lastModified\": \"2021-06-01T20:17:36Z\",\n" +
                "      \"name\": \"eaa6a31b-beaf-4580-a0e7-43025e0ba67e\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=a6805334-53f1-4a0e-aa8f-52355a67b1c4\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAraYRsRQav-zZSv1v4PkNiJBWZEqBgUUm\",\n" +
                "      \"lastModified\": \"2021-06-01T20:13:15Z\",\n" +
                "      \"name\": \"63062f46-3909-4be9-b884-9fe216abd588\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=5cca7678-f8ae-4991-8bac-0c3e8677dfa9\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAARYIwtirCiEBvL-ydkKLNOV4lSfAK9Lo5\",\n" +
                "      \"lastModified\": \"2021-06-01T20:07:59Z\",\n" +
                "      \"name\": \"8cbffdc3-d57a-45aa-b765-ba4460cc29ad\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=296151e2-f792-48fd-8075-5168c0255f98\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAQNjJB2tTlbjE7D1OsH4ksqVDjzoECHL4\",\n" +
                "      \"lastModified\": \"2021-06-01T20:04:47Z\",\n" +
                "      \"name\": \"b29d69b4-b864-412b-b1a1-1a9859b63fea\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=23dd37b6-689b-4a90-b2aa-f2e8d5f49456\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAxm5lhi4bTC96pf-bzCe_g7ByOhb_QgZ7\",\n" +
                "      \"lastModified\": \"2021-06-01T19:39:31Z\",\n" +
                "      \"name\": \"5b19337b-0889-46cc-98d6-913365d11b3b\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=e41b963a-3eaf-4d40-94d1-56939ac1781c\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAA4p5GJLgGtbR6JqLRNgApmrcYwbMMcY_4\",\n" +
                "      \"lastModified\": \"2021-06-01T19:05:54Z\",\n" +
                "      \"name\": \"512a49e0-820b-4e8a-8b77-01a50f3903c4\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=3034b81b-00a8-4df2-85d2-c8366abc32c1\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAARPbQO9Xp9UXbxG4Y4hQ9ZnnesHcNaVH5\",\n" +
                "      \"lastModified\": \"2021-06-01T19:03:31Z\",\n" +
                "      \"name\": \"7bc95c24-e6aa-49aa-869a-0f05831aa55e\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=7e953d2a-705a-4c52-ae1c-d1ad13ba59e1\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAfib8vRobbiSfBOBoVKr3kKWVkeRbeVfo\",\n" +
                "      \"lastModified\": \"2021-06-01T18:22:45Z\",\n" +
                "      \"name\": \"e5f4f07b-0498-4059-b2e9-27058e1189f4\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=1ecf731f-2b47-476e-889f-4f9448bcfc6a\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAZPQe4cDkTjZuaIPVC2B1G-c79JfqwL3D\",\n" +
                "      \"lastModified\": \"2021-06-01T18:03:26Z\",\n" +
                "      \"name\": \"72b2dbd9-d924-4ad1-b9d4-3377627c5605\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=57e3deec-b10d-4c41-9155-57913f4a5b0e\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAApDojOTbUNrj0HWIahgPgBedYTCxQ5b5D\",\n" +
                "      \"lastModified\": \"2021-05-27T00:01:08Z\",\n" +
                "      \"name\": \"8695a4d6-4635-4928-8697-fd4c618a1e56\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=d2dfbe7c-c39e-4260-abdf-3d6f2df701c3\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAINbyb6OSI4LBxrlL7_PJqlBp5i7lMxOW\",\n" +
                "      \"lastModified\": \"2021-05-26T23:54:52Z\",\n" +
                "      \"name\": \"b0d3dca7-0efb-47d5-8027-0314a51c7732\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=eb2ab6ac-f5f2-4975-8ba4-ae57942a775a\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAiklehCbKMVBl_7SEsBoae59_NV1Y2M7t\",\n" +
                "      \"lastModified\": \"2021-05-26T23:52:57Z\",\n" +
                "      \"name\": \"92d59a63-137e-4119-bfa1-329b0575db94\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=d78ac5b3-c98c-4e57-a94c-660d966bd628\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAd3IXsBSgHlXurFWj7kobsQGlwlQ7inAT\",\n" +
                "      \"lastModified\": \"2021-05-26T23:51:32Z\",\n" +
                "      \"name\": \"00aae6d6-5a82-4ddf-ac5d-af98c2d8fdd9\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=c24e518c-e84d-47ac-8c71-ea4a2618e2a3\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAkyLddxCZqyB7M_dhzWX3BUgPBPnF0cvA\",\n" +
                "      \"lastModified\": \"2021-05-26T23:11:44Z\",\n" +
                "      \"name\": \"ba7ad7c2-21db-43b8-b392-07a9a498ed73\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=a46d0de2-1524-4be1-995c-a51f5a933e5a\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAfst99ta7Jy_q_QGFZwCJn9yESSjaqRLM\",\n" +
                "      \"lastModified\": \"2021-05-26T20:26:09Z\",\n" +
                "      \"name\": \"c6739b28-73b6-4adc-a868-49b429099338\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=9043c04a-d98b-4807-b312-011c6124f34a\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAnr58nnt5ZNCPjUi9OgKAkGBlrmJ_6GfJ\",\n" +
                "      \"lastModified\": \"2021-05-26T20:16:47Z\",\n" +
                "      \"name\": \"5b0e67a3-6582-4dc5-b085-03ac3b9f3072\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=f93340f2-ea1a-4033-8c5f-4f0886403351\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAqnjrJB7iN0PzumxAT3sBf8he9KNe5QDa\",\n" +
                "      \"lastModified\": \"2021-05-26T20:15:45Z\",\n" +
                "      \"name\": \"b7dd8c50-43cd-4f4e-9713-a466ef408402\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=988907a8-5c2d-42af-951c-85a7515ef12f\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAgSFh7cpxojDKbXCtYbRKOM-bcZiQEwOp\",\n" +
                "      \"lastModified\": \"2021-05-26T20:13:01Z\",\n" +
                "      \"name\": \"827f7350-e1dc-4bcb-a9ba-97a39927c68e\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=8acfd26a-1266-4521-870c-db88a83c84eb\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAOF0HxQHzxxcytw2IICvWzvObXVmjQi7y\",\n" +
                "      \"lastModified\": \"2021-05-26T20:08:24Z\",\n" +
                "      \"name\": \"ec97acc9-95f7-416b-9163-e0d982e80da6\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=d169bcdf-5166-4ca8-a3a5-5eb3919db0b5\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"applicationName\": \"AdditionalAccessiblePrivateAPITestApp\",\n" +
                "      \"id\": \"CBJCHBCAABAAk68MqYfO7pJ3-y4SYFoy7yli8zrStGN4\",\n" +
                "      \"lastModified\": \"2021-05-26T18:46:43Z\",\n" +
                "      \"name\": \"4eb668e4-2905-4cef-bdbe-3eaa797c6713\",\n" +
                "      \"scope\": \"ACCOUNT\",\n" +
                "      \"webhookSubscriptionEvents\": [\n" +
                "        \"AGREEMENT_ALL\"\n" +
                "      ],\n" +
                "      \"webhookUrlInfo\": {\n" +
                "        \"url\": \"https://callback.echosignmail.com/postWebhooksPublish?guid=ef655f9e-769a-4c8b-90e8-cb2c22661194\"\n" +
                "      },\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"page\": {}\n" +
                "}";
        JSONObject json = new JSONObject(string);
//        System.out.println(json.toString());
        JSONArray userWebhookList = json.getJSONArray("userWebhookList");
        System.out.println(userWebhookList);


        for (int i = 0; i < userWebhookList.length(); i++) {
//            System.out.println(userWebhookList.get(i));
            JSONObject webhookObject = (JSONObject) userWebhookList.get(i);
            System.out.println(webhookObject.get("id"));
            String tempId = webhookObject.get("id").toString();
            String deleteWebhookEndpoint = String.format("https://api.na1.echosignawspreview.com:443/api/rest/v6/webhooks/%s",tempId);

            HttpResponse<String> response = Unirest.delete(deleteWebhookEndpoint)
                    .header("Authorization", "Bearer 3AAABLKmtbUCC5eXpfcUVyQs6nT7K39NBhfgIy50klME1eve01EpoPnl2VifTFy7UswB2mYf-X1B5V-kQtSLwHTJqoZzt-bFG")
                    .asString();

            System.out.println(response.getBody());
        }



    }
}
