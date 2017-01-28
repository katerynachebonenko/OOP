package OOP_week1.hometask3;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class University {
    private String name;
    private Group[] groups;

    public University(String name, Group[] groups) {
        this.name = name;
        this.groups = groups;
    }

    public void showGroups() {
        for (Group group : groups) {
            System.out.println(group.getName());
        }
    }

    public void showStudents() {
        for (Group group : groups) {
            group.showStudents();
        }
    }

    public void addGroup(Group group) {
        //check if student exists in students
        boolean exists = false;
        for (int i = 0; i < groups.length; i++) {
            if (group == groups[i]) {
                exists = true;
                System.out.println("Student exists in list");
                break;
            }
        }

        //if not exists add him
        if (exists == false) {
            Group[] array = new Group[groups.length + 1];
            System.arraycopy(groups, 0, array, 0, groups.length);
            array[array.length - 1] = group;

            groups = array;
        }

    }


    public void removeGroup(Group group) {
        //new array size = stud.length-1
        Group[] updatedGroups = new Group[groups.length - 1];
        boolean foundGroups = false;

        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == group) {
                foundGroups = true;

            } else {
                //write to new array
                if (foundGroups == false) {
                    updatedGroups[i] = groups[i];
                } else {
                    updatedGroups[i - 1] = groups[i];
                }

            }
        }
    }
}

