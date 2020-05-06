import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddfixeddepositComponent } from './addfixeddeposit.component';

describe('AddfixeddepositComponent', () => {
  let component: AddfixeddepositComponent;
  let fixture: ComponentFixture<AddfixeddepositComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddfixeddepositComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddfixeddepositComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
