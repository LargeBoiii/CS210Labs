package CS210LabSeven;

public class LinkedList 
{
        private Link first;
        
        public LinkedList()
        {
            first = null;
        }

        ////      GENERIC INSERTION/REMOVAL      ////
        
        public void insertAtHead(String name, int age, String course, int yearOfStudy)
        {
            Link newLink = new Link(name,age,course,yearOfStudy);
            if(first==null){
                first = newLink;
            }
            else{
            first.previous = newLink;
            newLink.next = first;
            this.first = newLink;
            }
        }

        public void insertAlphabetically(String name, int age, String course, int yearOfStudy)
        {
            Link newLink = new Link(name,age,course,yearOfStudy);
            if(first == null)
            {
                first = newLink;
            }
            Link current = first;
            Link previous = null;
            while(current != null)
            {
                if(current.name.compareTo(newLink.name) < 0)
                {
                    if(current == first)
                    {
                        first.previous = newLink;
                        newLink.next = first;
                        first = newLink;
                    }
                    else
                    {
                        previous.next = newLink;
                        newLink.previous = previous;
                        newLink.next = current;
                        current.previous = newLink;
                    }
                }
                previous = current;
                current = current.next;
            }
        }
        
        public void removeLink(Link current)      //remove a specific link
        {
            if(current == first)    //element to be removed is the first in list
            {
                first = first.next;
                first.previous = null;
            }
            else if(current.next != null)   //element to be removed is somewhere in the middle
            {
            current.previous.next = current.next;
            current.next.previous = current.previous;
            }
            else    //element to be removed is last
            {
                current.previous.next = null;
            }
        }
        
        ////        REMOVAL/PRINTING BY VALUE       ////

        public void removeLink(String paramName, String paramValue)
        {
            Link linkToBeRemoved = null;
            if(paramName.equalsIgnoreCase("name"))               //NAME
            {
                linkToBeRemoved = this.getLinkByValue(1,paramValue);
            }
            else if(paramName.equalsIgnoreCase(("age")))                       //AGE
            {
                linkToBeRemoved = this.getLinkByValue(2,paramValue);
            }
            else if(paramName.equalsIgnoreCase("course"))       //COURSE
            {
                linkToBeRemoved = this.getLinkByValue(3,paramValue);
            }
            else if(paramName.equalsIgnoreCase("year of study"))//YEAR OF STUDY   
            {
                linkToBeRemoved = this.getLinkByValue(4,paramValue);
            }
            removeLink(linkToBeRemoved);
        }
    
        public void printLink(String paramName, String paramValue)
        {
            Link linkToBePrinted = null;
            if(paramName.equalsIgnoreCase("name"))               //NAME
            {
                linkToBePrinted = this.getLinkByValue(1,paramValue);
            }
            else if(paramName.equalsIgnoreCase(("age")))                       //AGE
            {
                linkToBePrinted = this.getLinkByValue(2,paramValue);

            }
            else if(paramName.equalsIgnoreCase("course"))       //COURSE
            {
                linkToBePrinted = this.getLinkByValue(3,paramValue);
            }
            else if(paramName.equalsIgnoreCase("year of study"))//YEAR OF STUDY   
            {
                linkToBePrinted = this.getLinkByValue(4,paramValue);
            }

            if(linkToBePrinted != null)
            {
                printLink(linkToBePrinted);
            }
            else
            {
                System.out.println("Link with " + paramName + " value of: " + paramValue + " not found :(");
            }
        }

        ////        FIND LINK WITH MATCHING VALUE       ////  

        // Name = 1 ||  Age = 2  ||  Course = 3 ||  Year of study = 4
        public Link getLinkByValue(int paramNumber, String paramValue)
        {
            Link current = first;
            Link foundLink = null;
            int paramInt;
            if(paramNumber == 2 || paramNumber == 4)    //ensuring a valid number is passed when checkin age/yos
            {
                try{
                    paramInt = Integer.parseInt(paramValue);
                }
                catch(NumberFormatException e){
                    System.out.println(paramValue + " could not be converted to a number");
                    return null;
                }
            }
            while(current != null)
            {
                if(paramNumber == 1)        //name
                {
                    if(current.name.equalsIgnoreCase(paramValue))
                    {
                        foundLink = current;
                        break;
                    }
                }
                else if(paramNumber == 2)   //age
                {
                    paramInt = Integer.parseInt(paramValue);
                    if(current.age == paramInt)
                    {
                        foundLink = current;
                        break;
                    }
                }
                else if(paramNumber == 3)   //course
                {
                    if(current.course.equalsIgnoreCase(paramValue))
                    {
                        foundLink = current;
                        break;
                    }
                }
                else if(paramNumber == 4)   //year of study
                {
                    paramInt = Integer.parseInt(paramValue);
                    if(current.age == paramInt)
                    {
                        foundLink = current;
                        break;
                    }
                }
                current = current.next;
            }
            return foundLink;
        }

        ////      MISC METHODS        ////  

        public boolean isEmpty()
        {
            return (first == null);
        }

        public void printList()
        {
            Link current = first;
            if(!this.isEmpty())
            {
                while(current != null)
                {
                    printLink(current);
                    if(current.next != null)
                    {
                        current = current.next;
                    }
                    else{
                        break;
                    }
                }
            }
            else
            {
                System.out.println("The linked list is empty");
            }
        }
        
        public void printLink(Link link)
        {
            System.out.println(link.name + "," + link.age + "," + link.course + "," + link.yearOfStudy);
        }
}
