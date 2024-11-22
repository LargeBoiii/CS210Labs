package CS210LabSeven;

public class LinkedList 
{
        private Link first;
        
        public LinkedList()
        {
            first = null;
        }

        ////      MAIN METHODS      ////
        
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

        public void removeAtHead()
        {
            first = first.next;
        }
        
        //TODO: add deleteLink(String paramName, paramValue)
        //TODO: add printLink(String paramName, paramValue) 

        ////      MISC METHODS        ////  

        public boolean isEmpty()
        {
            return (first == null);
        }

        public Link getFirst()
        {
            return first;
        }


        public void printList()
        {
            Link current = first;
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

        public void printLink(Link link)
        {
            System.out.print( '\n' + link.name + ", ");
            System.out.print(link.age + ", ");
            System.out.print(link.course + ", ");
            System.out.print(link.yearOfStudy + '\n');
        }
}
