import { Component, OnInit } from '@angular/core';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr1Detail } from '../dvr1-detail';
import { map } from 'rxjs';
import { TypeModifier } from '@angular/compiler';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';

@Component({
  selector: 'app-dvr-report',
  templateUrl: './dvr-report.component.html',
  styleUrls: ['./dvr-report.component.css']
})
export class DvrReportComponent implements OnInit {

  dvr: any;
  form: any;
  to: any;
  dvrDetails: Dvr1Detail[] = [];
  mainArray:Array<any>=[];
  filterDataArray: Array<any> = [];
  cameraArray:Array<any>=[];
  cameraElement:Array<any>=[];
  floorNameArray:Array<any>=[];
  dateElement:any;

  

  newData: any = [
    {
      totalData: [
        {
          date: "02-08-2023",
          value: [{
            cameras: "Camera 1",
            roomName: "Main server room",
            floorNo: 2,
            liveStatus: "Working",
            playBackStatus: "not Working"
          },
          {
            cameras: "Camera 2",
            roomName: "Main  room",
            floorNo: 2,
            liveStatus: "Working",
            playBackStatus: " not Working"
          },
          ]
        },

        {
          date: "03-08-2023",
          value: [{
            cameras: "Camera 1",
            roomName: "Main server room",
            floorNo: 2,
            liveStatus: "Working",
            playBackStatus: "Working"
          },
          {
            cameras: "Camera 2",
            roomName: "Main  room",
            floorNo: 2,
            liveStatus: "Working",
            playBackStatus: "Working"
          },
          ]
        },

      ]
    }



  ]
  constructor(private dvrs: Dvr1serviceService, private router: Router, private activatedroute: ActivatedRoute) { }

  ngOnInit() {
    this.getData();
  }


  getData() {
    this.dvr = this.activatedroute.snapshot.params["dvrValue"];
    this.form = this.activatedroute.snapshot.params["formDate"];
    this.to = this.activatedroute.snapshot.params["toDate"];
    if (this.dvr !== null && this.form !== null && this.to !== null) {
      this.dvrs.getAllDvrDetailsService(this.dvr, this.form, this.to).subscribe(data => {

        this.dvrDetails = data;

        console.log(this.dvrDetails);
        
   interface transFormedArray{
          date:Date,
          values:Array<{
             cameras:String,
             roomName:String,
             floorNo:number,
             liveStatus:String,
             playBackStatus:String
          }>
        }

        var exsistingDateEntry:any;
        var exsistingCameraEntry:any;
      

        const finalArray:Array<transFormedArray>=this.dvrDetails.reduce((result:any,current:any)=>{
          exsistingDateEntry=result.find((entry:any)=>entry.date === current.date);

          if(exsistingDateEntry){
            exsistingCameraEntry=exsistingDateEntry.cameraName.find((camera:any)=>camera.cameras === current.cameras);
            if(exsistingCameraEntry){
              exsistingCameraEntry.values.push({
               
                roomName:current.roomName,
                floorNo:current.floorNo,
                liveStatus:current.liveStatus,
                playBackStatus:current.playBackStatus
             });
            }
            else{
              exsistingDateEntry.cameraName.push({
                cameras:current.cameras,
                values:[{
                  roomName:current.roomName,
                floorNo:current.floorNo,
                liveStatus:current.liveStatus,
                playBackStatus:current.playBackStatus
                }],
              });
            }
          }
          else{
            result.push({
              date:current.date,
              cameraName:[{
                cameras:current.cameras,
                values:[
                {
                  roomName:current.roomName,
                  floorNo:current.floorNo,
                  liveStatus:current.liveStatus,
                  playBackStatus:current.playBackStatus
                },
                ],
              },
            ],
            });
          }

        return result;
      
      },[] as transFormedArray[]);

      console.log(finalArray);
      this.mainArray=finalArray;


// loop functions
// this.dateArray= this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=> t.date === obj.date))
// for (let index = 0; index < this.dateArray.length; index++) {

//   this.filterDataArray=this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=>( t.cameras === obj.cameras && t.date === obj.date && t.floorNo ==obj.floorNo && t.roomName == obj.roomName) ))
  
// }
// var group={};
// var groupedData=data.reduce((result:any,current:any)=>{
//  group =result.find((item:any)=> item.date === current.date);
// if (group){
//   result.push(current.date,current.roomName,current.floorNo,current.playBackStatus,current.liveStatus,current.cameras)
// }
// else{
//   result.push({date:current.date,
//     value:[ {
   
//       cameras:current.cameras,
//       roomName:current.roomName,
//       floorNo:current.floorNo,
//       playBackStatus:current.playBackStatus,
//       liveStatus:current.liveStatus
//       }],
   
//   })
// }

// return result
// },[]);

// console.log(groupedData);
// this.filterDataArray=groupedData.map((t:any )=>{
//   return this.mainArray={
//     date:t.date,
//     value:[ {
   
//       cameras:t.cameras,
//       roomName:t.roomName,
//       floorNo:t.floorNo,
//       playBackStatus:t.playBackStatus,
//       liveStatus:t.liveStatus
//       }],
   
//   }
// })




        // console.log(this.dvrDetails);

// map functions

this.cameraArray= this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=>( t.cameras === obj.cameras &&  t.floorNo ==obj.floorNo && t.roomName == obj.roomName) ))
console.log(this.cameraArray);
// this.newCameraArray=this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=> t.cameras === obj.cameras))
// console.log(this.newCameraArray);
// this.floorNameArray=this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=> t.roomName === obj.roomName))
// console.log(this.floorNameArray);

// this.dateArray= this.dvrDetails.filter((obj,index,self)=>index === self.findIndex((t)=> t.date === obj.date))
// console.log(this.dateArray);

        // this.filterDataArray= this.dvrDetails.map((ar) => {
          
        //   for (let index = 0; index < this.dateArray.length; index++) {
        //     this.dateElement=this.dateArray[index]

        //     for (let index = 0; index < this.cameraArray.length; index++) {
        //      this.cameraElement=this.cameraArray[index]
             
             
        //      this.mainArray= [
        //         {
        //           totalData: [
        //             {
        //               date: this.dateElement,
        //               value: [{
                     
                       
        //                 cameras:this.cameraElement,
        //                 roomName: this.floorNameArray,
        //                 floorNo: ar.floorNo,
        //                 liveStatus: ar.liveStatus,
        //                 playBackStatus: ar.playBackStatus
        //               }
        //               ]
        //             },
        //           ]
        //         }
        //       ]


        //     }
           
         
        //   }
       

        //   return this.mainArray
        // } 
        // )

      //  interface transFormedArray{
      //     date:Date,
      //     values:Array<{
      //        cameras:String,
      //        roomName:String,
      //        floorNo:number,
      //        liveStatus:String,
      //        playBackStatus:String
      //     }>
      //   }

  


      })
    }

  }




  // pdf function

  savePdf(){
    let DATA: any = document.getElementById('htmlData');
    html2canvas(DATA).then((canvas) => {
      let fileWidth = 208;
      let fileHeight = (canvas.height * fileWidth) / canvas.width;
      const FILEURI = canvas.toDataURL('image/png');
      let PDF = new jsPDF('p', 'mm', 'a4');
      let position = 0;
      PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
      PDF.save(this.dvr+'.pdf');
    });
  }
}
