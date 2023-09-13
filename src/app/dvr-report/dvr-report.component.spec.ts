import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DvrReportComponent } from './dvr-report.component';

describe('DvrReportComponent', () => {
  let component: DvrReportComponent;
  let fixture: ComponentFixture<DvrReportComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DvrReportComponent]
    });
    fixture = TestBed.createComponent(DvrReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
