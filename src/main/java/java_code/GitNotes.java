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


            ##################################################

            Merge conflict:
                its when multiple contributors(2 or more people) changed the same file. To resolve conflict, we can do
                couple things:

                1. Stash changes:
                    if you didnt finish and you can not combine changes, stash your changes. In this case, you are not losing
                    changes forever.
                2. Discard your changes ( you are losing your changes forever):
                    Either git checkout file or git reset --hard
                3. Resolve conflict.
                    first of all we have to commit our changes
                    then pull
                    and check conflicting files (fix manually or through other tools, like in intellij )
                    Accept their changes
                    accept your changes
                    merge changes( compromise )

                    -once conflict is resolved, we can commit and push changes to github

                4. Just clone project again and copy paste your changes ( No, but this is what people usually do)

                   ################################3

          GIT BRANCHES

          What is branch?
            Its a one version of your project. With git, we can have multiple version of project that exist in parallel.
            Every branch can have independent commits history.

            Ideally everybody works on their own branch, and then once work is done, you can create pull request to
            apply your changes to main branch. This flow, allows to review code before accepting any changes.

            git branch
            * master

            Master branch should have latest stable and confirmed code.

            Ideally, master branch shouldn't accept direct commits. Otherwise changes can be committed without code review.
            Usually team lead review code. But if there is no team lead/ test lead , then we do peer review.
            Everyone must do code review. But test lead can decide/ choose the flow.
            Every commit must be reviewed.

            Commit code when you completed some work.

            The main idea is that we have to be careful with master branch.

       ***     In previous applications repository, we had a lot of branches.
            2.12
            2.13 - versions of applications.
            2.14
            release
            master
            dev
            newfeature

       git branch branchName  ===>> to create a new branch

       then run git branch to see list of branches


       If you don't stage files ( git add) and miss -a , you will get  "Nothing to commit".
       git log ==> to see history of commits.
       enter


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
