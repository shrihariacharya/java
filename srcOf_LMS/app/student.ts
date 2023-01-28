import { Book } from "./Book";

export class Student {

    sName:string='';
    sContact:string='';
    sEmail:string='';
    sDepartment:string='';
    book:Book={
        bId: 0,
        bBookName: "",
        bAuthorName: "",
        bPrice: 0,
        dateCreated: ""
    }
}
