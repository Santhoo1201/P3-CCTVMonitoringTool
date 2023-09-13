import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDvr2DetailsComponent } from './create-dvr2-details.component';

describe('CreateDvr2DetailsComponent', () => {
  let component: CreateDvr2DetailsComponent;
  let fixture: ComponentFixture<CreateDvr2DetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateDvr2DetailsComponent]
    });
    fixture = TestBed.createComponent(CreateDvr2DetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
