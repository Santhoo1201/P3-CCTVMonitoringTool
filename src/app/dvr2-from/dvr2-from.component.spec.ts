import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dvr2FromComponent } from './dvr2-from.component';

describe('Dvr2FromComponent', () => {
  let component: Dvr2FromComponent;
  let fixture: ComponentFixture<Dvr2FromComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Dvr2FromComponent]
    });
    fixture = TestBed.createComponent(Dvr2FromComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
