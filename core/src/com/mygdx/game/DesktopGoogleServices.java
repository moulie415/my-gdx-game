package com.mygdx.game;

/**
 * Created by hen10 on 14/03/2017.
 */
public class DesktopGoogleServices implements IGoogleServices
{
    @Override
    public void signIn()
    {
        System.out.println("DesktopGoogleServies: signIn()");
    }

    @Override
    public void signOut()
    {
        System.out.println("DesktopGoogleServies: signOut()");
    }

    @Override
    public void rateGame()
    {
        System.out.println("DesktopGoogleServices: rateGame()");
    }

    @Override
    public void submitScore(long score, String leaderboard)
    {
        System.out.println("DesktopGoogleServies: submitScore(" + score + ")");
    }

    @Override
    public void showScores(String leaderboard)
    {
        System.out.println("DesktopGoogleServies: showScores()");
    }

    @Override
    public boolean isSignedIn()
    {
        System.out.println("DesktopGoogleServies: isSignedIn()");
        return false;
    }

    @Override
    public void unlockAchievement(String achievement) {
        System.out.println("DesktopGoogleServices: achievement: " + achievement);

    }

    @Override
    public void showAchievements() {
        System.out.println("DesktopGoogleServices: showAchievements");


    }
}
