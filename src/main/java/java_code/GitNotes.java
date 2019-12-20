package java_code;

public class GitNotes {
    /*
    11/22/2019

    git is a version control tool,
    it keeps track of changes that were made,
    git remembers who did changes, when and what kind of changes,
    it helps to collaborate, so multiple developers can easily work together on the same project.
    Also, git is a distributed version control system(DVCS).

    Main version of the project will be in the cloud ( for example github)

    github : is a google drive for git projects/repositories

    for project we create a git repository.
    We have local repository( on your computer)
    and we have remote repository (on github)

    git knows about changes in our projects
    github works as a cloud storage for our projects.

    The process of getting a copy of projects call cloning

    git clone - stands for getting a copy of projects from remote.

    ========================================================

    if we modify a file that was changed by someone else before me, I can not pull updates.
    This situation is called merge conflict.

        There are 3 solutions:

       1. Stash changes:
            Its when you save your changes on a side. Then, you can apply your changes again after pull.
       2. Discard changes:
            its pretty much loss of your updates. If some file/files conflicts, you can discard your updates and pull code successfully.

       3. Resolve merge conflict right away.
            Step 1:
                add your file to the staging area ( git add . )
            Step 2:
                Commit changes
            Step 3:
                pull updates from remote repository (git pull )
            Step 4:
                Open conflicting files and either manually change them (fix) or use intellij conflict resolver, etc.

            blue
            red
            <<<<<<< HEAD
            black
            =======   // means where is conflict
            green
            >>>>>>> 8f9c3406c6e313e66d9095ec94b4f8cda289915a


            if different files were modified, git will resolve conflict automatically, if same file was modified,
            you will have to resolve conflict manually.



     */


    /*
    git status:
        to check what is new in your repository.

    On branch master:
        Your branch is up to date with 'origin/master'.

    Changes to be committed:
        (use "git reset HEAD <file>..." to unstage)

            new file:   colors.txt

    Changes not staged for commit:
        (use "git add <file>... " to update what will be committed)
        (use "git checkout ---<file>"  to discard changes in working directory)

            modified:   colors.txt

    git add colors.txt - to stage

     */

}
