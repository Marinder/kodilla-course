package com.kodilla.patterns.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("David");
        User yGeneration = new YGeneration("Karol");
        User zGeneration = new ZGeneration("John");

        //When
        String millenialsDavid = millenials.sharePost();
        System.out.println("David: " + millenialsDavid);
        String yGenerationKarol = yGeneration.sharePost();
        System.out.println("Karol: " + yGenerationKarol);
        String zGenerationJohn = zGeneration.sharePost();
        System.out.println("John: " + zGenerationJohn);

        //Then
        Assert.assertEquals("[Twitter publisher] Tweet [...]", millenialsDavid);
        Assert.assertEquals("[Facebook publisher] Post [...]", yGenerationKarol);
        Assert.assertEquals("[Snapchat publisher] Snap [...]", zGenerationJohn);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("David");

        //When
        String millenialsDavid = millenials.sharePost();
        System.out.println("David: " + millenialsDavid);
        millenials.setSocialPublisher(new SnapchatPublisher());
        millenialsDavid = millenials.sharePost();
        System.out.println("David now: " + millenialsDavid);

        //Then
        Assert.assertEquals("[Snapchat publisher] Snap [...]", millenialsDavid);
    }
}
