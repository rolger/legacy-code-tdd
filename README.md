# Refactoring exercise

### As a attendee I want to refactor the GildedRose so that I can add new features easily afterwards
* First, execute the approval tests (see ApprovalTest) and check the coverage of the Unit Tests 
* Apply refactorings until you think the code is readable and maintainable so that you are ready to add new features without any pain.
* Execute the approval tests (see ApprovalTest) after each refactoring step which serve as golden master and make sure the behaviour of the system has not changed
* Feel free to make any changes to the updateQuality method and add any new code as long as everything still works correctly. 
* Use the refactoring tools of your IDE whenever possible.
* The original requirements to the Gilded Rose can be found [here](https://github.com/NotMyself/GildedRose)

### Constraints
* Do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn’t believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we’ll cover for you).

### Additional Task
* We have recently signed a supplier of conjured items. This requires an update to our system:
    * "Conjured" items degrade in quality twice as fast as normal items

