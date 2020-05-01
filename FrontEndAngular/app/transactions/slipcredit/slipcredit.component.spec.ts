import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SlipcreditComponent } from './slipcredit.component';

describe('SlipcreditComponent', () => {
  let component: SlipcreditComponent;
  let fixture: ComponentFixture<SlipcreditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SlipcreditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SlipcreditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
